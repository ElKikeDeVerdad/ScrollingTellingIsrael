package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.contentInciforMiniScreen5.contentInciforMiniScreen5Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.contentInciforMiniScreen5.contentInciforMiniScreen5Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.contentInciforMiniScreen5.contentInciforMiniScreen5Box3

@Composable
fun InciforMiniScreen5(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.6f, Box3 = 0.1f),
            data = data,
            Box1 = { contentInciforMiniScreen5Box1(it) },
            Box2 = { contentInciforMiniScreen5Box2(it) },
            Box3 = { contentInciforMiniScreen5Box3() }
        )
    }
}