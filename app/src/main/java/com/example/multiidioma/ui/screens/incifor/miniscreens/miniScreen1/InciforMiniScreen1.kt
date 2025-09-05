package com.example.multiidioma.ui.screens.incifor.miniscreens.miniScreen1


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.MiniScreenData
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.multiidioma.ui.components.PlantillaScreen


@Composable
fun InciforMiniScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(
            data = data,
            Box1 = {contentInciforMiniScreen1Box1()},
            Box2={contentInciforMiniScreen1Box2(it)},
            Box3={contentInciforMiniScreen1Box3()}
        )
    }
}
