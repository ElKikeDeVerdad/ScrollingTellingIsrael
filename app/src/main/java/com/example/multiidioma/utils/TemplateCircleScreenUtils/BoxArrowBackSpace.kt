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
            .fillMaxSize() // más compacto que fillMaxHeight + fillMaxWidth
    ) {
        // 👉 Parte superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Start, // dejamos que los weights manden
                verticalAlignment = Alignment.Top
            ) {
                // Espaciador (mitad izquierda)
                Box(
                    modifier = Modifier
                        .weight(0.5f)
                        .fillMaxHeight()
                        .background(Color.Yellow) // solo referencia
                )

                // Contenedor de los botones (mitad derecha)
                Box(
                    modifier = Modifier
                        .weight(0.5f)
                        .fillMaxHeight()
                        .background(Color.Green) // solo referencia
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        ArrowImageUtil(
                            modifier = Modifier.fillMaxWidth(0.5f)
                        )
                        BackButtonCircleTemplateUtil(
                            modifier = Modifier.fillMaxWidth(0.5f)
                        )
                    }
                }
            }
        }

        // 👉 Parte inferior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.9f)
        )
    }
}