package com.example.daggerkata.data

import com.example.daggerkata.DaggerKataApplication

class GetDataUseCase(private val dataRepository: DataRepository) {

    fun getData() = dataRepository.getData()

}