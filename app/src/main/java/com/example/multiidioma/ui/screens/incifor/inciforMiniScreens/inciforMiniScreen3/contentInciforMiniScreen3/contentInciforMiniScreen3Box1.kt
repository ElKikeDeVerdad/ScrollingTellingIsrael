package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.contentInciforMiniScreen3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

@Composable
fun contentInciforMiniScreen3Box1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
    ) {
        LineCircleComponent(contentAlignment = Alignment.TopEnd)
    }
}