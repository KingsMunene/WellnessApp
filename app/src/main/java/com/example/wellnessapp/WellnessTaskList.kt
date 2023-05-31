package com.example.wellnessapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.wellnessapp.ui.theme.StateFullTaskItem
import com.example.wellnessapp.ui.theme.TaskItem

@Composable
fun TaskList(taskList: List<TaskClass>,
onClicked: (TaskClass) -> Unit,
onCheckChanged: (TaskClass, Boolean) -> Unit){
    LazyColumn(){
        items(items = taskList,
        key = {task -> task.taskID}){task ->
            StateFullTaskItem(taskName = task.taskName,
                onClicked = { onClicked(task) },
                checked = task.checked,
                onCheckChanged = {checked -> onCheckChanged(task, checked)})
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TaskListPrev() {

}