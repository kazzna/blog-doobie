package jp.kazzna.blog

import doobie.imports._

/**
  * Sample User class
  */
case class User(id: String, password: String, email: Option[String])

object User {
  def byId(id: String): ConnectionIO[Option[User]] =
    sql"MATCH (user :User{id: ${id}}) RETURN user.id, user.password, user.email".query[User].option
}