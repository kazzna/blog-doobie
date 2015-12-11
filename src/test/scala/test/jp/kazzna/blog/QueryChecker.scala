package test.jp.kazzna.blog

import java.io.{InputStream, Reader}
import java.math.BigDecimal
import java.net.URL
import java.sql._
import java.util
import java.util.concurrent.Executor
import java.util.{Calendar, Properties}

import org.scalatest._

/**
  * Dummy Connection for test
  */
case class QueryChecker(sql: String, params: Map[Int, Any], result: ResultSet) extends Connection with Matchers {
  override def setAutoCommit(b: Boolean): Unit = ???

  override def setHoldability(i: Int): Unit = ???

  override def clearWarnings(): Unit = ???

  override def getNetworkTimeout: Int = ???

  override def createBlob(): Blob = ???

  override def createSQLXML(): SQLXML = ???

  override def setSavepoint(): Savepoint = ???

  override def setSavepoint(s: String): Savepoint = ???

  override def createNClob(): NClob = ???

  override def getTransactionIsolation: Int = ???

  override def getClientInfo(s: String): String = ???

  override def getClientInfo: Properties = ???

  override def getSchema: String = ???

  override def setNetworkTimeout(executor: Executor, i: Int): Unit = ???

  override def getMetaData: DatabaseMetaData = ???

  override def getTypeMap: util.Map[String, Class[_]] = ???

  override def rollback(): Unit = ???

  override def rollback(savepoint: Savepoint): Unit = ???

  override def createStatement(): Statement = ???

  override def createStatement(i: Int, i1: Int): Statement = ???

  override def createStatement(i: Int, i1: Int, i2: Int): Statement = ???

  override def getHoldability: Int = ???

  override def setReadOnly(b: Boolean): Unit = ???

  override def setClientInfo(s: String, s1: String): Unit = ???

  override def setClientInfo(properties: Properties): Unit = ???

  override def isReadOnly: Boolean = ???

  override def setTypeMap(map: util.Map[String, Class[_]]): Unit = ???

  override def getCatalog: String = ???

  override def createClob(): Clob = ???

  override def nativeSQL(s: String): String = ???

  override def setTransactionIsolation(i: Int): Unit = ???

  override def prepareCall(s: String): CallableStatement = ???

  override def prepareCall(s: String, i: Int, i1: Int): CallableStatement = ???

  override def prepareCall(s: String, i: Int, i1: Int, i2: Int): CallableStatement = ???

  override def createArrayOf(s: String, objects: scala.Array[AnyRef]): Array = ???

  override def setCatalog(s: String): Unit = ???

  override def close(): Unit = ???

  override def getAutoCommit: Boolean = ???

  override def abort(executor: Executor): Unit = ???

  override def isValid(i: Int): Boolean = ???

  override def prepareStatement(s: String): PreparedStatement = new PreparedStatement {
    s should ===(sql)

    override def setByte(i: Int, b: Byte): Unit = ???

    override def getParameterMetaData: ParameterMetaData = ???

    override def setRef(i: Int, ref: Ref): Unit = ???

    override def clearParameters(): Unit = ???

    override def setBytes(i: Int, bytes: scala.Array[Byte]): Unit = ???

    override def setBinaryStream(i: Int, inputStream: InputStream, i1: Int): Unit = ???

    override def setBinaryStream(i: Int, inputStream: InputStream, l: Long): Unit = ???

    override def setBinaryStream(i: Int, inputStream: InputStream): Unit = ???

    override def setAsciiStream(i: Int, inputStream: InputStream, i1: Int): Unit = ???

    override def setAsciiStream(i: Int, inputStream: InputStream, l: Long): Unit = ???

    override def setAsciiStream(i: Int, inputStream: InputStream): Unit = ???

    override def setObject(i: Int, o: scala.Any, i1: Int): Unit = ???

    override def setObject(i: Int, o: scala.Any): Unit = ???

    override def setObject(i: Int, o: scala.Any, i1: Int, i2: Int): Unit = ???

    override def setDate(i: Int, date: Date): Unit = ???

    override def setDate(i: Int, date: Date, calendar: Calendar): Unit = ???

    override def setTimestamp(i: Int, timestamp: Timestamp): Unit = ???

    override def setTimestamp(i: Int, timestamp: Timestamp, calendar: Calendar): Unit = ???

    override def setUnicodeStream(i: Int, inputStream: InputStream, i1: Int): Unit = ???

    override def getMetaData: ResultSetMetaData = ???

    override def setBlob(i: Int, blob: Blob): Unit = ???

    override def setBlob(i: Int, inputStream: InputStream, l: Long): Unit = ???

    override def setBlob(i: Int, inputStream: InputStream): Unit = ???

    override def addBatch(): Unit = ???

    override def execute(): Boolean = ???

    override def executeQuery(): ResultSet = result

    override def setNClob(i: Int, nClob: NClob): Unit = ???

    override def setNClob(i: Int, reader: Reader, l: Long): Unit = ???

    override def setNClob(i: Int, reader: Reader): Unit = ???

    override def setArray(i: Int, array: Array): Unit = ???

    override def setNCharacterStream(i: Int, reader: Reader, l: Long): Unit = ???

    override def setNCharacterStream(i: Int, reader: Reader): Unit = ???

    override def setURL(i: Int, url: URL): Unit = ???

    override def setRowId(i: Int, rowId: RowId): Unit = ???

    override def setSQLXML(i: Int, sqlxml: SQLXML): Unit = ???

    override def setString(i: Int, s: String): Unit = {
      params(i) should ===(s)
    }

    override def setFloat(i: Int, v: Float): Unit = ???

    override def setNString(i: Int, s: String): Unit = ???

    override def setBoolean(i: Int, b: Boolean): Unit = ???

    override def setDouble(i: Int, v: Double): Unit = ???

    override def setBigDecimal(i: Int, bigDecimal: BigDecimal): Unit = ???

    override def executeUpdate(): Int = ???

    override def setTime(i: Int, time: Time): Unit = ???

    override def setTime(i: Int, time: Time, calendar: Calendar): Unit = ???

    override def setShort(i: Int, i1: Short): Unit = ???

    override def setLong(i: Int, l: Long): Unit = ???

    override def setCharacterStream(i: Int, reader: Reader, i1: Int): Unit = ???

    override def setCharacterStream(i: Int, reader: Reader, l: Long): Unit = ???

    override def setCharacterStream(i: Int, reader: Reader): Unit = ???

    override def setClob(i: Int, clob: Clob): Unit = ???

    override def setClob(i: Int, reader: Reader, l: Long): Unit = ???

    override def setClob(i: Int, reader: Reader): Unit = ???

    override def setNull(i: Int, i1: Int): Unit = ???

    override def setNull(i: Int, i1: Int, s: String): Unit = ???

    override def setInt(i: Int, i1: Int): Unit = ???

    override def setMaxFieldSize(i: Int): Unit = ???

    override def getMoreResults: Boolean = ???

    override def getMoreResults(i: Int): Boolean = ???

    override def clearWarnings(): Unit = ???

    override def getGeneratedKeys: ResultSet = ???

    override def closeOnCompletion(): Unit = ???

    override def cancel(): Unit = ???

    override def getResultSet: ResultSet = ???

    override def setPoolable(b: Boolean): Unit = ???

    override def isPoolable: Boolean = ???

    override def setCursorName(s: String): Unit = ???

    override def getUpdateCount: Int = ???

    override def addBatch(s: String): Unit = ???

    override def getMaxRows: Int = ???

    override def execute(s: String): Boolean = ???

    override def execute(s: String, i: Int): Boolean = ???

    override def execute(s: String, ints: scala.Array[Int]): Boolean = ???

    override def execute(s: String, strings: scala.Array[String]): Boolean = ???

    override def executeQuery(s: String): ResultSet = ???

    override def getResultSetType: Int = ???

    override def setMaxRows(i: Int): Unit = ???

    override def getFetchSize: Int = ???

    override def getResultSetHoldability: Int = ???

    override def setFetchDirection(i: Int): Unit = ???

    override def getFetchDirection: Int = ???

    override def getResultSetConcurrency: Int = ???

    override def clearBatch(): Unit = ???

    override def close(): Unit = {
      // do nothing
    }

    override def isClosed: Boolean = ???

    override def executeUpdate(s: String): Int = ???

    override def executeUpdate(s: String, i: Int): Int = ???

    override def executeUpdate(s: String, ints: scala.Array[Int]): Int = ???

    override def executeUpdate(s: String, strings: scala.Array[String]): Int = ???

    override def getQueryTimeout: Int = ???

    override def getWarnings: SQLWarning = ???

    override def setFetchSize(i: Int): Unit = ???

    override def setQueryTimeout(i: Int): Unit = ???

    override def executeBatch(): scala.Array[Int] = ???

    override def setEscapeProcessing(b: Boolean): Unit = ???

    override def getConnection: Connection = ???

    override def getMaxFieldSize: Int = ???

    override def isCloseOnCompletion: Boolean = ???

    override def unwrap[T](aClass: Class[T]): T = ???

    override def isWrapperFor(aClass: Class[_]): Boolean = ???
  }

  override def prepareStatement(s: String, i: Int, i1: Int): PreparedStatement = ???

  override def prepareStatement(s: String, i: Int, i1: Int, i2: Int): PreparedStatement = ???

  override def prepareStatement(s: String, i: Int): PreparedStatement = ???

  override def prepareStatement(s: String, ints: scala.Array[Int]): PreparedStatement = ???

  override def prepareStatement(s: String, strings: scala.Array[String]): PreparedStatement = ???

  override def releaseSavepoint(savepoint: Savepoint): Unit = ???

  override def isClosed: Boolean = ???

  override def createStruct(s: String, objects: scala.Array[AnyRef]): Struct = ???

  override def getWarnings: SQLWarning = ???

  override def setSchema(s: String): Unit = ???

  override def commit(): Unit = ???

  override def unwrap[T](aClass: Class[T]): T = ???

  override def isWrapperFor(aClass: Class[_]): Boolean = ???
}
