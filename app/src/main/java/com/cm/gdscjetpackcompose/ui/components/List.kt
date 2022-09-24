package com.cm.gdscjetpackcompose.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showSystemUi = true
)
@Composable
fun ListNotes() {
    LazyColumn() {
        for (i in 0..32) {
            item {
                NoteCard()
            }
        }
    }
}