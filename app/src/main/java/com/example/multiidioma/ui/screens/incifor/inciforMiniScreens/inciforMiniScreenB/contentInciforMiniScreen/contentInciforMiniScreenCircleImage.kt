package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen

import androidx.compose.runtime.Composable
import com.example.multiidioma.data.MiniScreenData

import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.utils.CircleStyleImage

@Composable
fun contentInciforMiniScreenCircleImage(data: MiniScreenData) {

    ReusableImage(data, CircleStyleImage)
}
