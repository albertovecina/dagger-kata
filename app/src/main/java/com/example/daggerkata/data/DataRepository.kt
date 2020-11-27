package com.example.daggerkata.data

class DataRepository(private val dataSource: DataSource) {

    fun getData() = dataSource.getData()

}