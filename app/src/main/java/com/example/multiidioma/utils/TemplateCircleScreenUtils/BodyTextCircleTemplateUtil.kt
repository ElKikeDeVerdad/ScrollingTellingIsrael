package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData

@Composable
fun BodyTextCircleTemplateUtil(
    data: MiniScreenData,
    BodyText: @Composable (MiniScreenData) -> Unit = {}
) {


    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(start = 106.dp)
    ) {
        BodyText(data)
    }
}