package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.contentInciforMiniScreen15.contentInciforMiniScreen15BodyText
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.contentInciforMiniScreen15.contentInciforMiniScreen15CircleImage
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.contentInciforMiniScreen15.contentInciforMiniScreen15TitleText

@Composable
fun InciforMiniScreen15(
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
            CircleImage = { contentInciforMiniScreen15CircleImage(it) },
            TitleText = { contentInciforMiniScreen15TitleText(it) },
            BodyText = { contentInciforMiniScreen15BodyText(it) }
        )
    }
}
