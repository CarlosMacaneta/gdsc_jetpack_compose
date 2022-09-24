package com.cm.gdscjetpackcompose.ui.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.LibraryBooks
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cm.gdscjetpackcompose.domain.model.Course
import com.cm.gdscjetpackcompose.domain.model.Subject

@Composable
fun CourseDropdown(
    modifier: Modifier = Modifier,
    data: List<Course> = mutableListOf()
) {
    var description by remember { mutableStateOf("") }

    val interactionSource = remember { MutableInteractionSource() }
    var isExpanded by remember { mutableStateOf(false) }

    val icon = if (isExpanded) Icons.Default.ArrowDropUp
    else Icons.Default.ArrowDropDown

    if (interactionSource.collectIsPressedAsState().value) {
        isExpanded = !isExpanded
    }

    Column(
        modifier = modifier
    ) {
        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text(text = "Course") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Book, contentDescription = null)
            },
            trailingIcon = {
                IconButton(onClick = { isExpanded = !isExpanded }) {
                    Icon(imageVector = icon, contentDescription = null)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            readOnly = true,
            interactionSource = interactionSource
        )

        if (data.isNotEmpty()) {
            DropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = !isExpanded }
            ) {
                data.forEach {
                    DropdownMenuItem(onClick = {
                        description = it.name
                    }) {
                        Text(text = it.name)
                    }
                }
            }
        }
    }
}

@Composable
fun SubjectDropdown(
    modifier: Modifier = Modifier,
    data: List<Subject> = mutableListOf()
) {
    var description by remember { mutableStateOf("") }

    val interactionSource = remember { MutableInteractionSource() }
    var isExpanded by remember { mutableStateOf(false) }

    val icon = if (isExpanded) Icons.Default.ArrowDropUp
    else Icons.Default.ArrowDropDown

    if (interactionSource.collectIsPressedAsState().value) {
        isExpanded = !isExpanded
    }

    Column(
        modifier = modifier
    ) {
        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text(text = "Subject") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.LibraryBooks, contentDescription = null)
            },
            trailingIcon = {
                IconButton(onClick = { isExpanded = !isExpanded }) {
                    Icon(imageVector = icon, contentDescription = null)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            readOnly = true,
            interactionSource = interactionSource
        )

        if (data.isNotEmpty()) {
            DropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = !isExpanded }
            ) {
                data.forEach {
                    DropdownMenuItem(onClick = {
                        description = it.name
                    }) {
                        Text(text = it.name)
                    }
                }
            }
        }
    }
}