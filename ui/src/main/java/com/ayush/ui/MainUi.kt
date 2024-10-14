package com.ayush.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.google.android.material.color.MaterialColors

@Composable
fun MainUI(modifier: Modifier = Modifier) {

    var changableValue by remember { mutableStateOf("Hey Babe") }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "I am from other Modules")
        Text(text = changableValue)
        Button(onClick = {
            changableValue= changableValue +"newe Text"
        },
            modifier = Modifier.padding(5.dp).border(1.dp, color = Color.Cyan, shape = RectangleShape)
            ) {
            Text("Other Module Clickable Button")
        }
    }
}