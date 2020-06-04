package ru.andreysozonov.geekkotlin.task1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val model = Model()
    private val viewStateLiveData: MutableLiveData<String> = MutableLiveData()


    init {
        model.value().observeForever {it ->
            viewStateLiveData.value = it
        }
    }

    fun viewState(): LiveData<String> = viewStateLiveData
}