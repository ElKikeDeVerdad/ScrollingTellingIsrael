package com.example.multiidioma.ui.components.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.StyleText
import com.example.multiidioma.ui.components.Shapes.CircleComponent

@Composable
fun TextWithCircle(
    data: MiniScreenData,
    style: StyleText,
    index: Int? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .background(Color.Gray),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.1f)
                .background(Color.Green)
        ) {
            CircleComponent(
                width = 15.dp,
                height = 15.dp,
                widthBox = 1f,
                color = Color.White,
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .background(Color.Blue)
        ) {
            TextBodyMedium(data = data, style = style, index = index)
        }

    }
}