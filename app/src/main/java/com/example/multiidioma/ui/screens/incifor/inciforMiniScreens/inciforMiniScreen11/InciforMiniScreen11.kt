package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.contentInciforMiniScreen.contentInciforMini11ScreenBox3
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.contentInciforMiniScreen.contentInciforMiniScreen11Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen11.contentInciforMiniScreen.contentInciforMiniScreen11Box2

@Composable
fun InciforMiniScreen11(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.33f, Box2 = 0.33f, Box3 = 0.33f),
            data = data,
            Box1 = { contentInciforMiniScreen11Box1(it) },
            Box2 = { contentInciforMiniScreen11Box2(it ) },
            Box3 = { contentInciforMini11ScreenBox3() }
        )
    }
}