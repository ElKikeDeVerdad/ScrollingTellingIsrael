package com.example.multiidioma.ui.screens.settings


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.multiidioma.R
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.LanguageSelector
import com.example.multiidioma.ui.components.SplashImaxen
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun SettingsScreen(languageViewModel: LanguageViewModel) {
    val context = LocalizedContext.current

    Scaffold { padding ->
        Box(modifier = Modifier.zIndex(-2f)){SplashImaxen(imageResId = R.drawable.fondohome)}
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){

            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = context.getString(R.string.greeting),
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(16.dp)
                )

                LanguageSelector(languageViewModel)

            }
        }


    }

}
