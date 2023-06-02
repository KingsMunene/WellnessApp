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

    fun changeTaskChecked(item: TaskClass, checked: Boolean){
        tasks.find {it.taskID == item.taskID}?.let {task ->
            task.checked = checked
        }
    }



}

// Mutable list of tasks
private fun getWellnessList() = List(30) {it -> TaskClass(it, "Task #$it")}
