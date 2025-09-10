package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentInciforMiniScreen2Box1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, bottom = 10.dp)
    ) {
        LineVerticalComponent(contentAlignment = Alignment.TopStart)

    }
}