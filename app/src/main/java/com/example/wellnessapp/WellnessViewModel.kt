package com.example.wellnessapp

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel


class WellnessViewModel : ViewModel() {

    // Get a list of task and make it a mutable state list
    private val _tasks = getWellnessList().toMutableStateList()

    // Expose the list as read-only
    val tasks : List<TaskClass>
        get() = _tasks

    // Function to remove a task from the list
    fun remove(item: TaskClass){
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: TaskClass, checked: Boolean){
        tasks.find {it.taskID == item.taskID}?.let {task ->
            task.checked = checked
        }
    }



}

// Function to generate a list of tasks
private fun getWellnessList() = List(30) {it -> TaskClass(it, "Task #$it")}
