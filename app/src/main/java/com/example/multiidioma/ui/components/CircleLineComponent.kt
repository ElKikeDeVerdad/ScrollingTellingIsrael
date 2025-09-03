package com.example.multiidioma.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CircleLineComponent() {
    Box(modifier = Modifier, contentAlignment = Alignment.Center){
        Column(modifier = Modifier.align(Alignment.Center)) {

            CircleComponent()
            Spacer(modifier = Modifier.height(20.dp))
            LineVerticalComponent()

        }

    }
}