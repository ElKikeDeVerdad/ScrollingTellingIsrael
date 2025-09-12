package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.contentInciforMiniScreen10.contentInciforMiniScreen10Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.contentInciforMiniScreen10.contentInciforMiniScreen10Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.contentInciforMiniScreen10.contentInciforMiniScreen10Box3

@Composable
fun InciforMiniScreen10(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Color(0xFF32627E))
            ) {
                TemplateScreen(
                    BoxWeight = BOX(Box1 = 0.30f, Box2 = 0.55f, Box3 = 0.15f),
                    data = data,
                    Box1 = { contentInciforMiniScreen10Box1() },
                    Box2 = { contentInciforMiniScreen10Box2(it) },
                    Box3 = { contentInciforMiniScreen10Box3() }
                )
            }
}