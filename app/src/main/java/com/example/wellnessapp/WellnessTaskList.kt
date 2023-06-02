package com.example.wellnessapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TaskList(taskList: List<TaskClass>,
    onClicked: (TaskClass) -> Unit,
    onCheckChanged: (TaskClass, Boolean) -> Unit
){
    LazyColumn(){
        items(items = taskList,
        key = {task -> task.taskID}
        ){task ->
            TaskItem(taskName = task.taskName,
                checkedValue = task.checked,
                onClicked = { onClicked(task) },
                onCheckChanged = {checkedValue -> onCheckChanged(task, checkedValue)})
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TaskListPrev() {

}