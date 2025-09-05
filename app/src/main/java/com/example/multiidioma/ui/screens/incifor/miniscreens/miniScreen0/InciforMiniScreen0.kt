package com.example.multiidioma.ui.screens.incifor.miniscreens.miniScreen0


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.components.PlantillaScreen


@Composable
fun InciforMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        PlantillaScreen(data = data, Box2 = { contentInciforMiniScreen0Box2(it) } , Box3 = {contentIniciforMiniScreenBox3()})
    }
}




