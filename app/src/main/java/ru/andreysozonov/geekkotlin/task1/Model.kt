package ru.andreysozonov.geekkotlin.task1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Model {

    private val liveDataValue: MutableLiveData<String> = MutableLiveData()

    init {
        liveDataValue.value = "Hello World"
    }

    fun value(): LiveData<String> = liveDataValue
}