package com.example.multiidioma.ui.components

import androidx.compose.foundation.border
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
fun CircleLineComponent() {
    Box(modifier = Modifier.border(width = 1.dp, color = Color.Black), contentAlignment = Alignment.Center){
        Column(modifier = Modifier.align(Alignment.Center).border(width = 1.dp, color = Color.Red)) {

            CircleComponent(width = 15.dp, height = 15.dp)
            Spacer(modifier = Modifier.height(20.dp))
            LineVerticalComponent()

        }

    }
}