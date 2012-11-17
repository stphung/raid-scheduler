package com.ph.models

/**
 * Candidates - Players with scores up to this point
 * Attendees - Player names of those who actually attended
 */
case class Schedule(date: String, candidates: List[Player], attendees: List[String])

object Schedule {
  def list: List[Schedule] = {
    val schedule0 = Schedule("11.01-02.2012",
                             Player.readList("Myr:1.0:D, Demantius:1.5:H, Metsu:1.5:D, Tarannon:2.0:T, Zeck:2.0:T, Raveanly:2.0:H, Tamoko:2.0:H, Uruviel:2.0:D, Billyumm:2.0:D, Saedrian:2.0:D, Sourr:2.0:D, Mybeautiful:2.0:D").sortWith(_.name < _.name),
                             List("Demantius", "Metsu", "Tarannon", "Zeck", "Raveanly", "Tamoko", "Uruviel", "Billyumm", "Saedrian", "Sourr", "Mybeautiful"))
    val schedule1 = Schedule("11.08-09.2012",
                             Player.readList("Myr:1.0:D, Demantius:1.5:H, Metsu:3.5:D, Tarannon:4.0:T, Zeck:4.0:T, Raveanly:4.0:H, Tamoko:4.0:H, Uruviel:4.0:D, Billyumm:4.0:D, Saedrian:4.0:D, Sourr:4.0:D, Mybeautiful:4.0:D").sortWith(_.name < _.name),
                             List("Metsu", "Tarannon", "Zeck", "Raveanly", "Tamoko", "Uruviel", "Billyumm", "Saedrian", "Sourr", "Mybeautiful"))
    val schedule2 = Schedule("11.15-16.2012",
                             Player.readList("Myr:3.0:D, Demantius:1.5:H, Metsu:5.5:D, Tarannon:6.0:T, Zeck:6.0:T, Raveanly:6.0:H, Tamoko:4.0:H, Uruviel:6.0:D, Billyumm:6.0:D, Saedrian:6.0:D, Sourr:6.0:D, Mybeautiful:4.0:D, Tankjr:4.0:H").sortWith(_.name < _.name),
                             List("Metsu", "Tarannon", "Zeck", "Raveanly", "Tankjr", "Uruviel", "Billyumm", "Saedrian", "Sourr", "Myr"))
    List(schedule0, schedule1, schedule2)
  }
}