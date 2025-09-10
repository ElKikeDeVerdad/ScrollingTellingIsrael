package com.example.multiidioma.ui.components.Shapes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp

@Composable
fun LineVerticalComponent(
    contentAlignment: Alignment = Alignment.Center,
    color: Color = Color.White
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = contentAlignment
    ) {
        VerticalDivider(
            modifier = Modifier.padding(start = 0.dp),
            color = color,
            thickness = 3.dp
        )
    }
}