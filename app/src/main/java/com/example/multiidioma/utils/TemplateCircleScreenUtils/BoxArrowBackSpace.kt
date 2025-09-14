package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BoxArrowBackSpace() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
        /*.background(Color.LightGray)*/
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
            /*.background(Color.Magenta)*/
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Top
            ) {
                ArrowImageUtil()

                BackButtonCircleTemplateUtil()
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.9f)
                .background(Color.Blue)
        ) {}
    }
}
