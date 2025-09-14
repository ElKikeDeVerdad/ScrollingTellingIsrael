package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R

@Composable
fun ArrowImageUtil() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.End
    ) {
        Image(
            painter = painterResource(R.drawable.noimagen),
            contentDescription = "Flecha de retroceso"
        )
    }
}