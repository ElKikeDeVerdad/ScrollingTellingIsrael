package com.example.multiidioma.ui.cimus.miniscreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.CircleLineComponent
import com.example.multiidioma.ui.components.LineCircleComponent
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel

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