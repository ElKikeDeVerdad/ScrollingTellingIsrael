package com.example.multiidioma.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LineVerticalComponent(){
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        VerticalDivider(
            modifier = Modifier.padding(horizontal = 0.dp),
            color = Color.Gray,
            thickness = 2.dp
        )
    }
}