package com.example.daggerkata.data

class DataSource {

    fun getData() = ApiInterface.instance.getData()

}