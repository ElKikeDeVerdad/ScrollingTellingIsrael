package com.example.multiidioma.ui.components.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.CircleComponent

@Composable
fun TextWithCircle() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.Blue)
            .padding(5.dp)
            .background(color = Color.Yellow),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .padding(0.dp)
                .background(color = Color.Cyan),
            text = "1978"
        )
        CircleComponent(width = 15.dp, height = 15.dp, widthBox = 1f)
    }
}