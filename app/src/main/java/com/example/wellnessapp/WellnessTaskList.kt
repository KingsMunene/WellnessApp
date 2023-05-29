package com.example.wellnessapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.wellnessapp.ui.theme.StateFullTaskItem
import com.example.wellnessapp.ui.theme.TaskItem

@Composable
fun TaskList() {
    LazyColumn(){
        items(list){task ->
            StateFullTaskItem(taskName = task.taskName)
        }
    }
}


private val list: List<TaskClass> = List(30) {it -> TaskClass(it, "Task #$it")}

@Preview(showBackground = true)
@Composable
fun TaskListPrev() {
    TaskList()
}