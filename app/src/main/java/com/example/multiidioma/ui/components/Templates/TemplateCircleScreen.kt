package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.R

@Composable
fun TemplateCircleScreen(
    data: MiniScreenData,
    CircleImage: @Composable (MiniScreenData) -> Unit = {},
    TitleText: @Composable (MiniScreenData) -> Unit = {},
    BodyText: @Composable (MiniScreenData) -> Unit = {}
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {

        //Row con circulo y titulo
        Row(
            modifier = Modifier
                .fillMaxHeight(0.3f)
                .fillMaxWidth()
                .background(Color.Gray)
        ) {
            //Imagen Circulo

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.25f)
                    .background(Color.Green),
            ) {
                CircleImage(data)
            }

            //Titulo
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
        //Columna con texto
        Column(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(start = 106.dp)
        ) {
            BodyText(data)
        }

        //Box con flecha, ATRAS y espacio final
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
                    Column(
                        modifier = Modifier
                            .fillMaxSize(0.5f)
                            .background(Color.Gray),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(R.string.boton_atras),

                            )
                    }


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
}

