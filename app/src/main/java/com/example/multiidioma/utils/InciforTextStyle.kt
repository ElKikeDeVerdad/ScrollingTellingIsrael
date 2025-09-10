package com.example.multiidioma.utils

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


data class InciforStyleTextBody(
    val style: TextStyle,
    val textAlign: TextAlign
)

@Composable
fun InciforBodyMediumStyle(
    style: TextStyle,
    textAlign: TextAlign
): InciforStyleTextBody {
    return InciforStyleTextBody(
        style ,
        textAlign
    )
}