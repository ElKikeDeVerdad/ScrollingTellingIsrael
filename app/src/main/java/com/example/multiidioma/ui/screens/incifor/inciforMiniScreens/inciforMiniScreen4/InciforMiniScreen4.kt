package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.contentInciforMiniScreen4.contentInciforMiniScreen4Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.contentInciforMiniScreen4.contentInciforMiniScreen4Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.contentInciforMiniScreen4.contentInciforMiniScreen4Box3

@Composable
fun InciforMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.33f, Box2 = 0.33f, Box3 = 0.33f),
            data = data,
            Box1 = { contentInciforMiniScreen4Box1(it) },
            Box2 = { contentInciforMiniScreen4Box2(it) },
            Box3 = { contentInciforMiniScreen4Box3() }
        )
    }
}