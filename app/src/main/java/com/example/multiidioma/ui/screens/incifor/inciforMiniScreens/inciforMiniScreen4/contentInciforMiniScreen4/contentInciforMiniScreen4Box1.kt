package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.contentInciforMiniScreen4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentInciforMiniScreen4Box1(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.TopEnd
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp)
    ) {

        ReusableImage(data, estilosImagen)

    }
}
