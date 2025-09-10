package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentInciforMiniScreen7Box2(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
        color = Color.Black
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 50.dp, end = 50.dp, top = 15.dp,

            )
    ) {

        TextBodyMedium(data, estilosTextos)
    }
}
