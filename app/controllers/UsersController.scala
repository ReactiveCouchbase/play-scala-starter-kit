package controllers


import org.reactivecouchbase.play.crud.CouchbaseCrudSourceController
import models.User
import models.User.userFmt
import org.reactivecouchbase.play._
import play.api.Play.current

object UsersController extends CouchbaseCrudSourceController[User] {
  def bucket = PlayCouchbase.bucket("default")
  override def defaultViewName = "by_name"
  override def defaultDesignDocname = "users"
  override def idKey = "id"
}