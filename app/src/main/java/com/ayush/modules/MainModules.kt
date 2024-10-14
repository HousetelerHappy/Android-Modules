package com.ayush.modules

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange

@Composable
fun AppModule(modifier: Modifier = Modifier) {
    var xname by remember { mutableStateOf("app moudles") }
    Text(text = xname)
    OutlinedButton(onClick = { xname = xname+ "3" }) {
        Text(text = "in the app Module")
    }
}