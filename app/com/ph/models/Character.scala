package com.ph.models

object Role extends Enumeration {
  type Role = Value
  val Tank = Value("T")
  val Heal = Value("H")
  val Damage = Value("D")
}

import Role._

case class Player(name: String, role: Role, score: Double) {
  override def toString = name + ":" + score + ":" + role
}

object Player {
  def readList(input: String): List[Player] = {
    input.split(",").map(read(_)).toList
  }
  
  def read(input: String): Player = {
    val data = input.split(":")
    val name = data(0).trim
    val score = data(1).toDouble
    val roles = readRole(data(2))
    Player(name, roles, score)
  }
  
  private def readRole(role: String): Role = Role.withName(role)
}