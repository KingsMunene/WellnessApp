package com.example.wellnessapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class TaskClass(val taskID : Int, var taskName : String,
                     initialCheck : Boolean = false){
    var checked by mutableStateOf(initialCheck)
}

