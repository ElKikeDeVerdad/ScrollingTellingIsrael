package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9.contentInciforMiniScreen9Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9.contentInciforMiniScreen9Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9.contentInciforMiniScreen9Box3

@Composable
fun InciforMiniScreen9(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.20f, Box2 = 0.25f, Box3 =
                0.55f),
            data = data,
            Box1 = { contentInciforMiniScreen9Box1(it) },
            Box2 = { contentInciforMiniScreen9Box2(it) },
            Box3 = { contentInciforMiniScreen9Box3(it) }
        )
    }
}