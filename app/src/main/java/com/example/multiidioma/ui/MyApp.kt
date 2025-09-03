package com.example.multiidioma.ui


import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.ui.screens.HomeScreen
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.ui.cimus.CimusScreen
import com.example.multiidioma.ui.screens.start.StartScreen
import com.example.multiidioma.ui.screens.settings.SettingsScreen
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.DetectScroll
import com.example.multiidioma.utils.TopBarUtils

val LocalizedContext = compositionLocalOf<Context> {
    error("No LocalizedContext provided")
}


@Composable
fun MyApp(languageViewModel: LanguageViewModel) {
    val context = LocalContext.current
    val language by languageViewModel.language.collectAsState()
    val localizedContext = context.setLocale(language)
    val listState = rememberLazyListState()

    // 👇 Estado de visibilidad de la BottomBar e TopBar
    var bottomBarVisible by remember { mutableStateOf(true) }
    var topBarVisible by remember { mutableStateOf(true) }

    DetectScroll(
        listState = listState,
        topBarVisible = { topBarVisible = it },
        bottomBarVisible = { bottomBarVisible = it }
    )

    CompositionLocalProvider(LocalizedContext provides localizedContext) {
        val navController = rememberNavController()

        Scaffold(
            topBar = {
                TopBarUtils(topBarVisible= topBarVisible, navController= navController)
            },
            bottomBar = { BottomBarUtils(bottomBarVisible = bottomBarVisible,navController = navController) }
        ) { padding ->
            NavHost(
                navController = navController,
                startDestination = "splash",
                modifier = Modifier.padding(padding)
            ) {
                composable("splash") {
                    StartScreen(navController)
                }
                composable("home") {
                    // 👉 pásale listState para que funcione el scroll
                    HomeScreen(languageViewModel, listState)
                }
                composable("settings") {
                    SettingsScreen(languageViewModel)
                }
                composable("cimus") {
                    CimusScreen(listState)
                }
            }
        }
    }
}
