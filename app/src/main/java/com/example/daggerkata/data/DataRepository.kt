package com.example.daggerkata.data

class DataRepository {

    var dataSource = DataSource()

    fun getData() = dataSource.getData()

}