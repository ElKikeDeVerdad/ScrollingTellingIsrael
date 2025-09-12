package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12.contentInciforMiniScreen2.contentInciforMiniScreen12Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12.contentInciforMiniScreen2.contentInciforMiniScreen12Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen12.contentInciforMiniScreen2.contentInciforMiniScreen12Box3

@Composable
fun InciforMiniScreen12(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.5f, Box3 = 0.2f),
            data = data,
            Box1 = { contentInciforMiniScreen12Box1() },
            Box2 = { contentInciforMiniScreen12Box2(it) },
            Box3 = { contentInciforMiniScreen12Box3() }
        )
    }
}


