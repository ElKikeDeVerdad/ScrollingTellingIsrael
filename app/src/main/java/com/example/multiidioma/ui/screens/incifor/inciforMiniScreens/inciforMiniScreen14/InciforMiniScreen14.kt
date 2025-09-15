package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14BodyText
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14CircleImage
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14TitleText


@Composable
fun InciforMiniScreen14(
    // pantalla
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateCircleScreen(
            data = data,
            CircleImage = { contentInciforMiniScreen14CircleImage(it) },
            TitleText = { contentInciforMiniScreen14TitleText(it) },
            BodyText = { contentInciforMiniScreen14BodyText(it) }
        )
    }
}
