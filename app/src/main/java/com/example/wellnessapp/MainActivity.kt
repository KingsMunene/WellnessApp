package com.example.wellnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


import com.example.wellnessapp.ui.theme.WellnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  WellnessScreen()
                }
            }
        }
    }
}

@Composable
fun WellnessScreen(wellnessViewModel: WellnessViewModel = viewModel()) {
    Column {
        StateFullCounter()

        TaskList(taskList = wellnessViewModel.tasks,
            onClicked = {task -> wellnessViewModel.remove(task) },
            onCheckChanged = {taskClass, checked -> wellnessViewModel.changeTaskChecked(taskClass, checked)}
            )
    }
}

@Composable
fun StateFullCounter() {
    var counter by rememberSaveable{ mutableStateOf(0)}

    Counter(counter = counter, onIncrement = {counter ++})
}

@Composable
fun Counter(modifier: Modifier = Modifier,
counter: Int,
onIncrement: () -> Unit) {
    Column(modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(stringResource(R.string.counter_message, counter),
        style = MaterialTheme.typography.headlineMedium)

        OutlinedButton(onClick = onIncrement) {
            Text(text = stringResource(R.string.button_name))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WellnessAppTheme {
       WellnessScreen()
    }
}