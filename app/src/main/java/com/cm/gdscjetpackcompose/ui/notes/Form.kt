package com.cm.gdscjetpackcompose.ui.notes

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.SignalCellularAlt
import androidx.compose.material.icons.filled.Title
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cm.gdscjetpackcompose.R
import com.cm.gdscjetpackcompose.ui.components.CourseDropdown
import com.cm.gdscjetpackcompose.ui.components.SubjectDropdown

@Preview(
    showBackground = true
)
@Composable
fun Form() {

    var taskTitle by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var course by remember { mutableStateOf("") }
    var academicYear by remember { mutableStateOf("") }
    var time by remember { mutableStateOf("") }
    var conclusionDate by remember { mutableStateOf("") }

    val timeSource = remember { MutableInteractionSource() }
    val conclusionDateSource = remember { MutableInteractionSource() }


    /*if (timeSource.collectIsPressedAsState().value) {
        TimePickerComponent { time = it }
    }
    if (conclusionDateSource.collectIsPressedAsState().value) {
        DatePickerComponent { conclusionDate = it }
    }*/

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.schedule_logo),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(64.dp)
        )

        Text(
            text = "Adiciona Tarefa",
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        )

        Text(
            text = "Preencha os detalhes abaixo para adicionar uma tarefa ao seu TODO",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

        TextField(
            value = taskTitle,
            onValueChange = { taskTitle = it },
            label = { Text(text = "Title") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Title, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences,
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
        )

        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text(text = "Description") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Description, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Characters,
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
        )

        CourseDropdown()

        SubjectDropdown()

        TextField(
            value = academicYear,
            onValueChange = { academicYear = it },
            label = { Text(text = "Academic Year") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.SignalCellularAlt, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            )
        )

        TextField(
            value = time,
            onValueChange = { time = it },
            label = { Text(text = "Time") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccessTime, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            readOnly = true,
            interactionSource = timeSource
        )

        TextField(
            value = conclusionDate,
            onValueChange = { conclusionDate = it },
            label = { Text(text = "Date") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.CalendarMonth, contentDescription = null)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            readOnly = true,
            interactionSource = conclusionDateSource
        )
    }
}