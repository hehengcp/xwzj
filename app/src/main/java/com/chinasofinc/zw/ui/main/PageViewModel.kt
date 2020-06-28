package com.chinasofinc.zw.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = Transformations.map(_text) {
        "section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }

    fun setText(text: String) {
        _text.value = text
    }
}