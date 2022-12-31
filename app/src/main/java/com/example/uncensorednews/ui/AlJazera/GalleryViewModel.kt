package com.example.uncensorednews.ui.AlJazera

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is AlJazera Fragment"
    }
    val text: LiveData<String> = _text
}