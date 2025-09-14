package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BodyTextCircleTemplateUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.BoxArrowBackSpace
import com.example.multiidioma.utils.TemplateCircleScreenUtils.CircleImageUtil
import com.example.multiidioma.utils.TemplateCircleScreenUtils.TitleTextCircleTemplateutil

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
            CircleImageUtil(data, CircleImage)

            //Titulo
            TitleTextCircleTemplateutil(data, TitleText)
        }

        //Columna con texto
        BodyTextCircleTemplateUtil(data, BodyText)

        //Box con flecha, ATRAS y espacio final
        BoxArrowBackSpace()
    }
}


