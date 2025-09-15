package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenData

@Composable
fun CircleImageUtil(
    data: MiniScreenData,
    CircleImage: @Composable (MiniScreenData) -> Unit = {},
) {

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.25f),
        contentAlignment = Alignment.CenterStart

    ) {
        CircleImage(data)
    }
}