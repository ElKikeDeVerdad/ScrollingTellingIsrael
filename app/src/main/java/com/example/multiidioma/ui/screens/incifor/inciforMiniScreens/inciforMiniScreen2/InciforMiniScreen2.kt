package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PlantillaScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2.contentInciforMiniScreen2Box3

@Composable
fun InciforMiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            BoxWeight = BOX(Box1 = 0.15f, Box2 = 0.7f, Box3 = 0.15f),
            data = data,
            Box1 = { contentInciforMiniScreen2Box1() },
            Box2 = { contentInciforMiniScreen2Box2(it) },
            Box3 = { contentInciforMiniScreen2Box3() }
        )
    }
}


