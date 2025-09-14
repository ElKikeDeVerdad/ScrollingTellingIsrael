package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenData

@Composable
fun TitleTextCircleTemplateutil(
    data: MiniScreenData,
    TitleText: @Composable (MiniScreenData) -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Red),
        verticalArrangement = Arrangement.Bottom

    ) {
        TitleText(data)
    }
}