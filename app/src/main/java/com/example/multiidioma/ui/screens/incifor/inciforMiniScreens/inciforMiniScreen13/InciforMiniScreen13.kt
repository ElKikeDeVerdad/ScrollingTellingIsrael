package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen.contentInciforMiniScreen13Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen.contentInciforMiniScreen13Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen.contentInciforMiniScreen13Box3


@Composable
fun InciforMiniScreen13(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.33f, Box2 = 0.33f, Box3 = 0.33f),
            data = data,
            Box1 = { contentInciforMiniScreen13Box1() },
            Box2 = { contentInciforMiniScreen13Box2() },
            Box3 = { contentInciforMiniScreen13Box3() }
        )
    }
}
