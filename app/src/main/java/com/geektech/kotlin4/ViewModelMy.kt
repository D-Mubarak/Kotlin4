package com.geektech.kotlin4

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMy : ViewModel() {

    private var mCounter = 0

    private lateinit var storyList: MutableList<Int>
    val storyLiveData = MutableLiveData<ArrayList<String>>()
    val counter = MutableLiveData<Int>()
    val list = arrayListOf<String>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("+ \n")
        storyLiveData.value = list
    }

    fun onDecrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("- \n")
        storyLiveData.value = list
    }
}