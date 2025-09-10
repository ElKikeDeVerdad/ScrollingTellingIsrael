package com.example.multiidioma.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

data class StyleText(
    val style: TextStyle,
    val textAlign: TextAlign,
    val color: Color = Color.White
)
