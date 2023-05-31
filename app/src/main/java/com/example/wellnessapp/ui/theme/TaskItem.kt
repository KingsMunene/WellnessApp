package com.example.wellnessapp.ui.theme


import android.widget.CheckBox
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wellnessapp.TaskClass

@Composable
fun StateFullTaskItem(taskName: String,
                      onClicked: () -> Unit,
                      onCheckChanged: (Boolean) -> Unit,
                      checked : Boolean
) {
    TaskItem(taskName = taskName,
        checkedValue = checked,
        onCheckChanged = onCheckChanged,
        onClicked = onClicked
    )


}

@Composable
fun TaskItem( modifier: Modifier = Modifier,
              taskName: String,
              checkedValue: Boolean,
              onCheckChanged: (Boolean) -> Unit,
    onClicked: () -> Unit) {
    Row(modifier = modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically){
        Text(text = taskName,
        modifier = Modifier.weight(1f),
        style = MaterialTheme.typography.bodyMedium)

        Checkbox(checked = checkedValue,
            onCheckedChange = onCheckChanged )

        IconButton(onClick = onClicked) {
            Icon(imageVector = Icons.Filled.Close,
                contentDescription = "Close")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPrev() {
    TaskItem(taskName = "This nuts", checkedValue = false, onCheckChanged = {}, onClicked = {})
}