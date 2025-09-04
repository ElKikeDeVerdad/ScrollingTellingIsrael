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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign


@Composable
fun InciforMiniScreen1(
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
            verticalArrangement = Arrangement.Center
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Canvas(
                    modifier = Modifier
                        .width(6.dp)
                        .fillMaxHeight(0.5f)
                ) {
                    drawLine(
                        color = Color.White,
                        start = Offset(x = size.width / 2, y = 0f),
                        end = Offset(x = size.width / 2, y = size.height),
                        strokeWidth = size.width
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Canvas(
                    modifier = Modifier.size(16.dp)
                ) {
                    drawCircle(
                        color = Color.White,
                        radius = size.minDimension / 2
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.25f)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 50.dp, end = 50.dp, top =50.dp)

                ) {
                    data.bodyParagraphs.forEach { res ->
                        Text(
                            text = runCatching { context.getString(res) }.getOrElse { "???" },
                            color = Color.White,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center
                        )
                    }

                    data.imageRes?.let { res ->
                        Image(
                            painter = painterResource(res),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize(),
                            Alignment.BottomCenter
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.2f)

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
        }
    }
}
