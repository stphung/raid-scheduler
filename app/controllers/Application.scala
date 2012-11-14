package controllers

import com.ph.models._
import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(Schedule.list.reverse, Scheduler.schedule(Schedule.list.last.candidates)))
  }
}