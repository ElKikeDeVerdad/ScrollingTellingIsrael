package com.example.multiidioma.ui.screens.start

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.SplashImaxen
import kotlinx.coroutines.delay

@Composable
fun StartScreen(navController: NavController) {
    LaunchedEffect(true) {
        delay(3000L)
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // Imagen de fondo full screen
        SplashImaxen(imageResId = R.drawable.imaxeninicial)

        // Logo centrado encima
        SplashImaxen(
            imageResId = R.drawable.logo_en_branco,
            modifier = Modifier.size(300.dp)
        )
    }
}
