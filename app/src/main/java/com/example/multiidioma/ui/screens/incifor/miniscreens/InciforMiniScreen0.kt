package com.example.multiidioma.ui.screens.incifor.miniscreens


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.MiniScreenData


@Composable
fun InciforMiniScreen0(
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
            modifier = Modifier.fillMaxSize()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.10f)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.33f)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 50.dp, end = 50.dp)
                ) {
                    data.bodyParagraphs.forEach { res ->
                        Text(
                            text = runCatching { context.getString(res) }.getOrElse { "???" },
                            color = Color.White,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.33f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Canvas(
                    modifier = Modifier.size(16.dp)
                ) {
                    drawCircle(
                        color = Color.White,
                        radius = size.minDimension / 2
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))


                Canvas(
                    modifier = Modifier
                        .width(6.dp)
                        .fillMaxHeight()
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




