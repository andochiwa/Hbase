package com.github

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.TableName
import org.apache.hadoop.hbase.client.ConnectionFactory

/**
 * @author Andochiwa
 * @version 1.0
 * @since 01-24-21:35
 */
fun main() {
    println(isTableExist("test"))
}

fun isTableExist(tableName: String): Boolean {
    val configuration = HBaseConfiguration.create()
    configuration.set("hbase.zookeeper.quorum", "127.0.0.1")
    configuration.set("hbase.zookeeper.property.clientPort", "2181")
    val admin = ConnectionFactory.createConnection(configuration).admin
    val tableExists = admin.tableExists(TableName.valueOf(tableName))
    admin.close()
    return tableExists
}
