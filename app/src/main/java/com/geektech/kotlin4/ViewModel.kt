package com.geektech.kotlin4

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var mCounter = 0

    private lateinit var storyList: MutableList<Int>
    val storyLiveData = MutableLiveData<String>()
    val counter = MutableLiveData<Int>()

    fun onIncrementClick() {
        mCounter++
        val add = "add\n"
        counter.value = mCounter
        storyLiveData.value = add
        Log.e("ololo", mCounter.toString())
        storyLiveData.value = mCounter.toString()
    }

    fun onDecrementClick() {
        mCounter--
        val minus = "minus\n"
        counter.value = mCounter
        storyLiveData.value = minus
        Log.e("ololo", mCounter.toString())
        storyLiveData.value = mCounter.toString()
    }
}