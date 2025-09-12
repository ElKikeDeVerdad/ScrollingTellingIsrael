package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7.contentInciforMiniScreen7Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7.contentInciforMiniScreen7Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7.contentInciforMiniScreen7Box3

@Composable
fun InciforMiniScreen7(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.1f, Box2 = 0.35f, Box3 = 0.55f),
            data = data,
            Box1 = { contentInciforMiniScreen7Box1() },
            Box2 = { contentInciforMiniScreen7Box2(it)},
            Box3 = { contentInciforMiniScreen7Box3(it)}
        )
    }
}