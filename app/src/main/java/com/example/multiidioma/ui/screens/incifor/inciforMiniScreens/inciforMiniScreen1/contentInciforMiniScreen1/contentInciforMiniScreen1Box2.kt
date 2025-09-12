package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.Text.TextBodyMedium

@Composable
fun contentInciforMiniScreen1Box2(data: MiniScreenData) {

    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center
    )

    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top = 50.dp)
        /*.background(Color.Green)*/

    ) {
        TextBodyMedium(data, estilosTextos)

        Spacer(modifier = Modifier.height(25.dp))

        ReusableImage(data, estilosImagen)


    }
}