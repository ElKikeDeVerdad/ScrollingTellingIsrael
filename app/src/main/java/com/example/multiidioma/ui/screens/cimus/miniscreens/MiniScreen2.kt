package com.example.multiidioma.ui.screens.cimus.miniscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

@Composable
fun MiniScreen2(
    data: MiniScreenData,
    modifier: Modifier = Modifier
) {
    // Usa el contexto localizado que ya pusiste en CompositionLocalProvider
    val context = LocalizedContext.current

    Column(modifier = modifier.padding(16.dp)) {
        //LineCircleComponent()
        data.bodyParagraphs.forEach { res ->
            Text(
                text =  runCatching { context.getString(res) }.getOrElse { "???" },
                style = MaterialTheme.typography.bodyMedium
            )
        }
        LineCircleComponent()
    }
}