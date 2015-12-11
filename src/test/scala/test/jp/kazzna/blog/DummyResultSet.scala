package test.jp.kazzna.blog

import java.io.{Reader, InputStream}
import java.math.BigDecimal
import java.net.URL
import java.sql._
import java.util
import java.util.Calendar

/**
  * ResultSet for test
  */
class DummyResultSet(v: Seq[Map[Int, Any]]) extends ResultSet {
  var rowIndex = -1
  override def getType: Int = ???

  override def isBeforeFirst: Boolean = ???

  override def next(): Boolean = {
    rowIndex = rowIndex + 1
    rowIndex < v.length
  }

  override def updateString(i: Int, s: String): Unit = ???

  override def updateString(s: String, s1: String): Unit = ???

  override def getTimestamp(i: Int): Timestamp = ???

  override def getTimestamp(s: String): Timestamp = ???

  override def getTimestamp(i: Int, calendar: Calendar): Timestamp = ???

  override def getTimestamp(s: String, calendar: Calendar): Timestamp = ???

  override def updateNString(i: Int, s: String): Unit = ???

  override def updateNString(s: String, s1: String): Unit = ???

  override def clearWarnings(): Unit = ???

  override def updateTimestamp(i: Int, timestamp: Timestamp): Unit = ???

  override def updateTimestamp(s: String, timestamp: Timestamp): Unit = ???

  override def updateByte(i: Int, b: Byte): Unit = ???

  override def updateByte(s: String, b: Byte): Unit = ???

  override def updateBigDecimal(i: Int, bigDecimal: BigDecimal): Unit = ???

  override def updateBigDecimal(s: String, bigDecimal: BigDecimal): Unit = ???

  override def updateDouble(i: Int, v: Double): Unit = ???

  override def updateDouble(s: String, v: Double): Unit = ???

  override def updateDate(i: Int, date: Date): Unit = ???

  override def updateDate(s: String, date: Date): Unit = ???

  override def isAfterLast: Boolean = ???

  override def updateBoolean(i: Int, b: Boolean): Unit = ???

  override def updateBoolean(s: String, b: Boolean): Unit = ???

  override def getBinaryStream(i: Int): InputStream = ???

  override def getBinaryStream(s: String): InputStream = ???

  override def beforeFirst(): Unit = ???

  override def updateNCharacterStream(i: Int, reader: Reader, l: Long): Unit = ???

  override def updateNCharacterStream(s: String, reader: Reader, l: Long): Unit = ???

  override def updateNCharacterStream(i: Int, reader: Reader): Unit = ???

  override def updateNCharacterStream(s: String, reader: Reader): Unit = ???

  override def updateNClob(i: Int, nClob: NClob): Unit = ???

  override def updateNClob(s: String, nClob: NClob): Unit = ???

  override def updateNClob(i: Int, reader: Reader, l: Long): Unit = ???

  override def updateNClob(s: String, reader: Reader, l: Long): Unit = ???

  override def updateNClob(i: Int, reader: Reader): Unit = ???

  override def updateNClob(s: String, reader: Reader): Unit = ???

  override def last(): Boolean = ???

  override def isLast: Boolean = ???

  override def getNClob(i: Int): NClob = ???

  override def getNClob(s: String): NClob = ???

  override def getCharacterStream(i: Int): Reader = ???

  override def getCharacterStream(s: String): Reader = ???

  override def updateArray(i: Int, array: Array): Unit = ???

  override def updateArray(s: String, array: Array): Unit = ???

  override def updateBlob(i: Int, blob: Blob): Unit = ???

  override def updateBlob(s: String, blob: Blob): Unit = ???

  override def updateBlob(i: Int, inputStream: InputStream, l: Long): Unit = ???

  override def updateBlob(s: String, inputStream: InputStream, l: Long): Unit = ???

  override def updateBlob(i: Int, inputStream: InputStream): Unit = ???

  override def updateBlob(s: String, inputStream: InputStream): Unit = ???

  override def getDouble(i: Int): Double = ???

  override def getDouble(s: String): Double = ???

  override def getArray(i: Int): Array = ???

  override def getArray(s: String): Array = ???

  override def isFirst: Boolean = ???

  override def getURL(i: Int): URL = ???

  override def getURL(s: String): URL = ???

  override def updateRow(): Unit = ???

  override def insertRow(): Unit = ???

  override def getMetaData: ResultSetMetaData = ???

  override def updateBinaryStream(i: Int, inputStream: InputStream, i1: Int): Unit = ???

  override def updateBinaryStream(s: String, inputStream: InputStream, i: Int): Unit = ???

  override def updateBinaryStream(i: Int, inputStream: InputStream, l: Long): Unit = ???

  override def updateBinaryStream(s: String, inputStream: InputStream, l: Long): Unit = ???

  override def updateBinaryStream(i: Int, inputStream: InputStream): Unit = ???

  override def updateBinaryStream(s: String, inputStream: InputStream): Unit = ???

  override def absolute(i: Int): Boolean = ???

  override def updateRowId(i: Int, rowId: RowId): Unit = ???

  override def updateRowId(s: String, rowId: RowId): Unit = ???

  override def getRowId(i: Int): RowId = ???

  override def getRowId(s: String): RowId = ???

  override def moveToInsertRow(): Unit = ???

  override def rowInserted(): Boolean = ???

  override def getFloat(i: Int): Float = ???

  override def getFloat(s: String): Float = ???

  override def getBigDecimal(i: Int, i1: Int): BigDecimal = ???

  override def getBigDecimal(s: String, i: Int): BigDecimal = ???

  override def getBigDecimal(i: Int): BigDecimal = ???

  override def getBigDecimal(s: String): BigDecimal = ???

  override def getClob(i: Int): Clob = ???

  override def getClob(s: String): Clob = ???

  override def getRow: Int = ???

  override def getLong(i: Int): Long = ???

  override def getLong(s: String): Long = ???

  override def getHoldability: Int = ???

  override def updateFloat(i: Int, v: Float): Unit = ???

  override def updateFloat(s: String, v: Float): Unit = ???

  override def afterLast(): Unit = ???

  override def refreshRow(): Unit = ???

  override def getNString(i: Int): String = ???

  override def getNString(s: String): String = ???

  override def deleteRow(): Unit = ???

  override def getConcurrency: Int = ???

  override def updateObject(i: Int, o: scala.Any, i1: Int): Unit = ???

  override def updateObject(i: Int, o: scala.Any): Unit = ???

  override def updateObject(s: String, o: scala.Any, i: Int): Unit = ???

  override def updateObject(s: String, o: scala.Any): Unit = ???

  override def getFetchSize: Int = ???

  override def getTime(i: Int): Time = ???

  override def getTime(s: String): Time = ???

  override def getTime(i: Int, calendar: Calendar): Time = ???

  override def getTime(s: String, calendar: Calendar): Time = ???

  override def updateCharacterStream(i: Int, reader: Reader, i1: Int): Unit = ???

  override def updateCharacterStream(s: String, reader: Reader, i: Int): Unit = ???

  override def updateCharacterStream(i: Int, reader: Reader, l: Long): Unit = ???

  override def updateCharacterStream(s: String, reader: Reader, l: Long): Unit = ???

  override def updateCharacterStream(i: Int, reader: Reader): Unit = ???

  override def updateCharacterStream(s: String, reader: Reader): Unit = ???

  override def getByte(i: Int): Byte = ???

  override def getByte(s: String): Byte = ???

  override def getBoolean(i: Int): Boolean = ???

  override def getBoolean(s: String): Boolean = ???

  override def setFetchDirection(i: Int): Unit = ???

  override def getFetchDirection: Int = ???

  override def updateRef(i: Int, ref: Ref): Unit = ???

  override def updateRef(s: String, ref: Ref): Unit = ???

  override def getAsciiStream(i: Int): InputStream = ???

  override def getAsciiStream(s: String): InputStream = ???

  override def getShort(i: Int): Short = ???

  override def getShort(s: String): Short = ???

  override def getObject(i: Int): AnyRef = ???

  override def getObject(s: String): AnyRef = ???

  override def getObject(i: Int, map: util.Map[String, Class[_]]): AnyRef = ???

  override def getObject(s: String, map: util.Map[String, Class[_]]): AnyRef = ???

  override def getObject[T](i: Int, aClass: Class[T]): T = ???

  override def getObject[T](s: String, aClass: Class[T]): T = ???

  override def updateShort(i: Int, i1: Short): Unit = ???

  override def updateShort(s: String, i: Short): Unit = ???

  override def getNCharacterStream(i: Int): Reader = ???

  override def getNCharacterStream(s: String): Reader = ???

  override def close(): Unit = {
    // do nothing
  }

  override def relative(i: Int): Boolean = ???

  override def updateInt(i: Int, i1: Int): Unit = ???

  override def updateInt(s: String, i: Int): Unit = ???

  override def wasNull(): Boolean = false

  override def rowUpdated(): Boolean = ???

  override def getRef(i: Int): Ref = ???

  override def getRef(s: String): Ref = ???

  override def updateLong(i: Int, l: Long): Unit = ???

  override def updateLong(s: String, l: Long): Unit = ???

  override def moveToCurrentRow(): Unit = ???

  override def isClosed: Boolean = ???

  override def updateClob(i: Int, clob: Clob): Unit = ???

  override def updateClob(s: String, clob: Clob): Unit = ???

  override def updateClob(i: Int, reader: Reader, l: Long): Unit = ???

  override def updateClob(s: String, reader: Reader, l: Long): Unit = ???

  override def updateClob(i: Int, reader: Reader): Unit = ???

  override def updateClob(s: String, reader: Reader): Unit = ???

  override def findColumn(s: String): Int = ???

  override def getWarnings: SQLWarning = ???

  override def getDate(i: Int): Date = ???

  override def getDate(s: String): Date = ???

  override def getDate(i: Int, calendar: Calendar): Date = ???

  override def getDate(s: String, calendar: Calendar): Date = ???

  override def getCursorName: String = ???

  override def updateNull(i: Int): Unit = ???

  override def updateNull(s: String): Unit = ???

  override def getStatement: Statement = ???

  override def cancelRowUpdates(): Unit = ???

  override def getSQLXML(i: Int): SQLXML = ???

  override def getSQLXML(s: String): SQLXML = ???

  override def getUnicodeStream(i: Int): InputStream = ???

  override def getUnicodeStream(s: String): InputStream = ???

  override def getInt(i: Int): Int = ???

  override def getInt(s: String): Int = ???

  override def updateTime(i: Int, time: Time): Unit = ???

  override def updateTime(s: String, time: Time): Unit = ???

  override def setFetchSize(i: Int): Unit = ???

  override def previous(): Boolean = ???

  override def updateAsciiStream(i: Int, inputStream: InputStream, i1: Int): Unit = ???

  override def updateAsciiStream(s: String, inputStream: InputStream, i: Int): Unit = ???

  override def updateAsciiStream(i: Int, inputStream: InputStream, l: Long): Unit = ???

  override def updateAsciiStream(s: String, inputStream: InputStream, l: Long): Unit = ???

  override def updateAsciiStream(i: Int, inputStream: InputStream): Unit = ???

  override def updateAsciiStream(s: String, inputStream: InputStream): Unit = ???

  override def rowDeleted(): Boolean = ???

  override def getBlob(i: Int): Blob = ???

  override def getBlob(s: String): Blob = ???

  override def first(): Boolean = ???

  override def getBytes(i: Int): scala.Array[Byte] = ???

  override def getBytes(s: String): scala.Array[Byte] = ???

  override def updateBytes(i: Int, bytes: scala.Array[Byte]): Unit = ???

  override def updateBytes(s: String, bytes: scala.Array[Byte]): Unit = ???

  override def updateSQLXML(i: Int, sqlxml: SQLXML): Unit = ???

  override def updateSQLXML(s: String, sqlxml: SQLXML): Unit = ???

  override def getString(i: Int): String = v(rowIndex)(i).asInstanceOf[String]

  override def getString(s: String): String = ???

  override def unwrap[T](aClass: Class[T]): T = ???

  override def isWrapperFor(aClass: Class[_]): Boolean = ???
}
