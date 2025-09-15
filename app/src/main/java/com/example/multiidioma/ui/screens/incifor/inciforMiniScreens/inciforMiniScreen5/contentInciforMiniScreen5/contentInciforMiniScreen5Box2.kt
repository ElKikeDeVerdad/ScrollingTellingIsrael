package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.contentInciforMiniScreen5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentInciforMiniScreen5Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(0.5f),
        alignment = Alignment.BottomEnd,
        contentScale = ContentScale.FillBounds
    )
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,

        )
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data, estilosTextos)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f),
            contentAlignment = Alignment.BottomEnd
        ) {
            ReusableImage(data, estilosImagen)
        }
    }
}