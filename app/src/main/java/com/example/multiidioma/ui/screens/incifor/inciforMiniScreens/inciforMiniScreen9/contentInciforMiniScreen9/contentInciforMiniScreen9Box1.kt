package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ContextualFlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentInciforMiniScreen9Box1(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.BottomCenter,
        contentScale = ContentScale.FillBounds
    )

    ReusableImage(data, estilosImagen)
}
