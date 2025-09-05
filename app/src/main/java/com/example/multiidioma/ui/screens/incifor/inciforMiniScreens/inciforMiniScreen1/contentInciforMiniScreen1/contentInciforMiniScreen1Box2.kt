package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.contentInciforMiniScreen1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData

@Composable
fun contentInciforMiniScreen1Box2(data: MiniScreenData){
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp, top =50.dp)

    ) {
        data.bodyParagraphs.forEach { res ->
            Text(
                text = runCatching { context.getString(res) }.getOrElse { "???" },
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
        }

        data.imageRes?.let { res ->
            Image(
                painter = painterResource(res),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(),
                Alignment.BottomCenter
            )
        }
    }
}