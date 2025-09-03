package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.TextosBuscadosData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.utils.xmlToAnnotatedString


@Composable
fun MiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    // Usa el contexto localizado que ya pusiste en CompositionLocalProvider
    val context = LocalizedContext.current

    Box{
        Column(modifier = modifier.padding(16.dp).fillMaxSize().border(width = 2.dp, color = Color.Blue)) {
            Box{
                VideoScreen(videoId = "92UgRKX8ooM", // tu ID de video
                    modifier = Modifier.fillMaxSize().aspectRatio(9f / 16f))
            }
            Box(modifier = modifier.fillMaxSize().background(color = Color.Transparent)){
                Column(
                    modifier = Modifier.fillMaxWidth() // Esto hace que la columna ocupe todo el ancho disponible
                ) {
                    val textosBuscados = listOf(R.string.texto_buscado)
                    data.bodyParagraphs.forEach { res ->
                        val rawText = runCatching { context.getString(res) }.getOrElse { "???" }

                        Text(
                            text = xmlToAnnotatedString(parrafo = rawText, context = context,textosBuscados = TextosBuscadosData(textosBuscados)),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }

                }
            }



        }
    }


}

