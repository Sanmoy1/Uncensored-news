package com.example.uncensorednews.ui.CNN

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is CNN Fragment"
    }
    val text: LiveData<String> = _text
}