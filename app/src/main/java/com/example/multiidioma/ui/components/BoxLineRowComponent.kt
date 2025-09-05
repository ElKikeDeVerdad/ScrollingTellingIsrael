package com.example.multiidioma.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxLineRowComponent(proporcionHeight: Float){
    Row (
        modifier = Modifier.fillMaxWidth().border(width = 1.dp, color = Color.Blue).padding(5.dp).fillMaxHeight(proporcionHeight),
        horizontalArrangement = Arrangement.SpaceBetween){
        Spacer(modifier = Modifier.fillMaxWidth(0.3f))
        Box(modifier = Modifier.fillMaxWidth(0.3f).background(color = Color.Green), contentAlignment = Alignment.Center){
            VerticalDivider(
                modifier = Modifier.padding(horizontal = 0.dp).background(color = Color.White),
                color = Color.Red,
                thickness = 2.dp
            )
        }


    }
}