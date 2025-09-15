package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.multiidioma.R

@Composable
fun ArrowImageUtil(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight()
            .background(Color.Gray),
        horizontalAlignment = Alignment.End
    ) {
        Image(
            painter = painterResource(R.drawable.incifor_img_36),
            contentScale = ContentScale.FillHeight,
            contentDescription = "Flecha de retroceso",
            modifier = Modifier.fillMaxSize().align(alignment = Alignment.End)
        )
    }
}