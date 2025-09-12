package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.valoresTemplateScreen


@Composable
fun TemplateScreen(
    data: MiniScreenData,
    BoxWeight: BOX = valoresTemplateScreen,
    Box1: @Composable (MiniScreenData) -> Unit = {},
    Box2: @Composable (MiniScreenData) -> Unit = {},
    Box3: @Composable (MiniScreenData) -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(BoxWeight.Box1)
        ) {
            Box1(data)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(BoxWeight.Box2)
        ) {
            Box2(data)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(BoxWeight.Box3)
        ) {
            Box3(data)
        }
    }
}