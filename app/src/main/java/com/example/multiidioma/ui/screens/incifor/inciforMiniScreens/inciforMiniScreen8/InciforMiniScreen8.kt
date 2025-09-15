package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.contentInciforMiniScreen8.contentInciforMiniScreen8Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.contentInciforMiniScreen8.contentInciforMiniScreen8Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.contentInciforMiniScreen8.contentInciforMiniScreen8Box3

@Composable
fun InciforMiniScreen8(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.65f, Box2 = 0.1f, Box3 = 0.25f),
            data = data,
            Box1 = { contentInciforMiniScreen8Box1() },
            Box2 = { contentInciforMiniScreen8Box2(it) },
            Box3 = { contentInciforMiniScreen8Box3() }
        )
    }
}