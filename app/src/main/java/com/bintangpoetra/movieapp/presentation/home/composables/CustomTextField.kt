package com.bintangpoetra.movieapp.presentation.home.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(title: String, textState: String, onTextChange: (String) -> Unit) {

    OutlinedTextField(
        value = textState,
        onValueChange = {
            onTextChange(it)
        },
        label = { Text(text = title) },
        singleLine = true,
        modifier = Modifier.padding(10.dp),
        textStyle = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
    )
}