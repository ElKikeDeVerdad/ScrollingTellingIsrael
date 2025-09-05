package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.contentInciforMiniScreen0

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import com.example.multiidioma.data.MiniScreenData

@Composable
fun contentInciforMiniScreen0Box2(data: MiniScreenData){
    val context = LocalContext.current
    data.bodyParagraphs.forEach { res ->
        Text(
            text = runCatching { context.getString(res) }.getOrElse { "???" },
            color = Color.White,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
    }
}