package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.contentInciforMiniScreen2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.ui.components.Text.TextBodyMedium


@Composable
fun contentInciforMiniScreen2Box2(data: MiniScreenData) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 50.dp, end = 50.dp)
        ) {
            val estilosTextos = StyleText(style = MaterialTheme.typography.bodyMedium,textAlign = TextAlign.Center)

            TextBodyMedium(data,estilosTextos)
        }

        Box {
            data.imageRes?.let { res ->
                Image(
                    painter = painterResource(res),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
