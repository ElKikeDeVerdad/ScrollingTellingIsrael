package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.ui.components.LineCircleComponent

@Composable
fun contentInciforMiniScreen1Box1() {
    Column(modifier = Modifier
        .background(Color.Red)
        .fillMaxSize()
    ) {
        LineCircleComponent()
    }
}
