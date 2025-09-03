package com.example.multiidioma.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBarUtils(bottomBarVisible : Boolean,navController: NavHostController){

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    if ((currentRoute == "home" || currentRoute == "settings" || currentRoute == "cimus")) {
        AnimatedVisibility(
            visible = bottomBarVisible,
            enter = slideInVertically(initialOffsetY = { it }),
            exit = slideOutVertically(targetOffsetY = { it })
        ) {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(106.dp)
            ) {
                // Botón 1
                TextButton(onClick = { navController.navigate("home") }) {
                    Text("Inicio")
                }
                Spacer(modifier = Modifier.weight(1f))
                // Botón 2
                TextButton(onClick = { navController.navigate("settings") }) {
                    Text("Settings")
                }
                Spacer(modifier = Modifier.weight(1f))
                // Botón 3
                TextButton(onClick = { navController.navigate("cimus") }) {
                    Text("Cimus")
                }
            }
        }
    }
}