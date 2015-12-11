package test.jp.kazzna.blog

import doobie.imports._
import jp.kazzna.blog.User
import org.scalatest._

import scalaz.effect.IO
import scalaz.syntax.monad._

/**
  * Test sql statement without database
  */
class SqlSpec extends FlatSpec with Matchers {
  "Without sql" should "not use any connection" in {
    val expected = 42
    val a = expected.point[ConnectionIO].transK[IO]
    val b = QueryChecker("", Map(), new DummyResultSet(Seq()))
    val actual = a(b).unsafePerformIO
    actual should ===(expected)
  }

  "Sql" should "be checked by test Connection" in {
    val id = "kazzna"
    val query = """MATCH (user :User{id: ?}) RETURN user.id, user.password, user.email"""
    val map = Map(1 -> id, 2 -> "pass", 3 -> "email@example.jp")
    val expected = Some(User(map(1), map(2), Some(map(3))))
    val a = User.byId(id).transK[IO]
    val b = QueryChecker(query, Map(1 -> id), new DummyResultSet(Seq(map)))
    val actual = a(b).unsafePerformIO
    actual should ===(expected)
  }

}
