package com.example.multiidioma.ui.components.Text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleText


@Composable
fun TextBodyMedium(
    data: MiniScreenData,
    style: StyleText
) {
    val context = LocalContext.current

    Column {
        data.bodyParagraphs.forEach { res ->
            Text(
                text = runCatching { context.getString(res) }.getOrElse { "???" },
                color = style.color,
                style = style.style,
                textAlign = style.textAlign,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}