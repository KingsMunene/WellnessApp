package com.example.wellnessapp

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessList().toMutableStateList()

    val tasks : List<TaskClass>
        get() = _tasks

    fun remove(item: TaskClass){
        _tasks.remove(item)
    }



}

// Mutable list of tasks
private fun getWellnessList() = List(30) {it -> TaskClass(it, "Task #$it")}
