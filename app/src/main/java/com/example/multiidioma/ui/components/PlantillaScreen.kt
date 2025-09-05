package com.example.multiidioma.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.data.valoresPlantillaScreen

@Composable
fun PlantillaScreen(
    data: MiniScreenData,
    Box1: @Composable (MiniScreenData) -> Unit = {},
    Box2: @Composable (MiniScreenData) -> Unit = {},
    Box3: @Composable (MiniScreenData) -> Unit = {}
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(valoresPlantillaScreen.Box1)
        ) {
            Box1(data)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(valoresPlantillaScreen.Box2)
                .background(Color.Green)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 50.dp, end = 50.dp)
            ) {
                Box2(data)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(valoresPlantillaScreen.Box3),
            contentAlignment = Alignment.Center
        ) {
            Box3(data)
        }
    }

}