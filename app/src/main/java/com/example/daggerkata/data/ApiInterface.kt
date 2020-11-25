package com.example.daggerkata.data

class ApiInterface {

    companion object {
        val instance: ApiInterface by lazy { ApiInterface() }
    }

    fun getData() = "Hola mundo"

}