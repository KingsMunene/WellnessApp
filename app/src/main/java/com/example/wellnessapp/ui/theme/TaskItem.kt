package com.example.wellnessapp.ui.theme


import android.widget.CheckBox
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StateFullTaskItem() {

}

@Composable
fun TaskItem(taskName: String,
checkedValue: Boolean, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically){
        Text(text = taskName,
        modifier = Modifier.weight(1f),
        style = MaterialTheme.typography.bodyMedium)
        Checkbox(checked = checkedValue,
            onCheckedChange = {} )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Close,
                contentDescription = "Close")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPrev() {
    TaskItem(taskName = "This nuts", checkedValue = false)
}