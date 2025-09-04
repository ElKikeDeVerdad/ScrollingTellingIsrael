package com.example.multiidioma.ui.screens.incifor.miniscreens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData

@Composable
fun InciforMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.15f)
            ) {
                Canvas(
                    modifier = Modifier
                        .width(56.dp)
                        .fillMaxHeight()
                        .padding(start = 50.dp)
                ) {
                    drawLine(
                        color = Color.White,
                        start = Offset(x = size.width / 2, y = 0f),
                        end = Offset(x = size.width / 2, y = size.height),
                        strokeWidth = size.width
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.18f)
                    .padding(start = 50.dp, end = 50.dp),
                verticalArrangement = Arrangement.Center
            ) {
                data.bodyParagraphs.forEach { res ->
                    Text(
                        text = runCatching { context.getString(res) }.getOrElse { "???" },
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                data.imageRes?.let { res ->
                    Image(
                        painter = painterResource(res),
                        contentDescription = "",
                        modifier = Modifier.fillMaxHeight(0.8f)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.15f),
                horizontalAlignment = Alignment.End
            ) {
                Canvas(
                    modifier = Modifier
                        .width(50.dp)
                        .fillMaxHeight()
                        .padding(end = 44.dp)
                ) {
                    drawLine(
                        color = Color.White,
                        start = Offset(x = size.width / 2, y = 0f),
                        end = Offset(x = size.width / 2, y = size.height),
                        strokeWidth = size.width
                    )
                }
            }
        }
    }
}



