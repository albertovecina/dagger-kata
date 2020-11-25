package com.example.daggerkata.data

import com.example.daggerkata.DaggerKataApplication

class GetDataUseCase {

    fun getData() = DaggerKataApplication.dataRepository.getData()

}