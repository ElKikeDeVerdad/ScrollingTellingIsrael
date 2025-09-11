package com.example.multiidioma.ui.components.Shapes


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LineCircleComponent(
    contentAlignment: Alignment = Alignment.Center,
    color: Color = Color.White
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = contentAlignment
    ) {
        Column(
            modifier = Modifier.align(contentAlignment)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.8f),
                contentAlignment = contentAlignment
            ) {
                LineVerticalComponent(color = color)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.2f),
                contentAlignment = contentAlignment
            ) {
                CircleComponent(width = 15.dp, height = 15.dp, widthBox = 1f, color = color)
            }
        }
    }
}
