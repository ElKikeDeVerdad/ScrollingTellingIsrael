package com.example.multiidioma.ui.components.Images

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleImages

@Composable
fun ReusableImage(
    data: MiniScreenData,
    style: StyleImages
) {

    data.imageRes?.let { res ->
        Image(
            painter = painterResource(res),
            contentDescription = "",
            contentScale = style.contentScale,
            modifier = style.modifier,
            alignment = style.alignment
        )
    }
}