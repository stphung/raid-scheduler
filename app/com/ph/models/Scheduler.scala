package com.ph.models

import Role._

object Scheduler {
  def schedule(players: List[Player]): Schedule = {
    val compositions = players.combinations(10).toList
    val candidates = compositions.filter(comp => {
      comp.filter(_.role == Tank).size == 2 &&
      comp.filter(_.role == Heal).size == 3 &&
      comp.filter(_.role == Damage).size == 5
    }).toList

    val scored = candidates.map(comp => {
      val score = comp.map(_.score).sum
      (score, comp)
    }).sortWith((a,b) => a._1 < b._1)

    val target = scored.head._2
    
    val bench = players.filterNot(target.contains)
    val targetNext = target.map(c => Player(c.name, c.role, c.score + 2.0))

    Schedule("next (11.29-30.2012)", targetNext ++ bench, targetNext.map(_.name))
  }
}