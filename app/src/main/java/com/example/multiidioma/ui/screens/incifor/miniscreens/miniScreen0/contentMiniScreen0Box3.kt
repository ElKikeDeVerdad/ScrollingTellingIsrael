package com.example.multiidioma.ui.screens.incifor.miniscreens.miniScreen0

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun contentIniciforMiniScreenBox3(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Canvas(
            modifier = Modifier.size(16.dp)
        ) {
            drawCircle(
                color = Color.White,
                radius = size.minDimension / 2
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        Canvas(
            modifier = Modifier
                .width(6.dp)
                .fillMaxHeight()
        ) {
            drawLine(
                color = Color.White,
                start = Offset(x = size.width / 2, y = 0f),
                end = Offset(x = size.width / 2, y = size.height),
                strokeWidth = size.width
            )
        }
    }
}