package com.example.multiidioma.ui.components.Shapes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircleLineComponent(
    contentAlignment: Alignment = Alignment.Center,
    color: Color = Color.White
) {
    Box(
        modifier = Modifier
        /*   .border(width = 1.dp, color = Color.Black)*/,
        contentAlignment = contentAlignment
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
            /*.border(width = 1.dp, color = Color.Red)*/
        ) {

            CircleComponent(width = 15.dp, height = 15.dp, widthBox = 1f, color = color)
            Spacer(modifier = Modifier.height(15.dp))
            LineVerticalComponent(color = color)

        }

    }
}
