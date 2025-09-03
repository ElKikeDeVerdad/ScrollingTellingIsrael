package com.example.multiidioma.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.multiidioma.R
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun HomeScreen(languageViewModel: LanguageViewModel, listState: LazyListState){


    val greeting = languageViewModel.getString(R.string.greeting)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = greeting, style = MaterialTheme.typography.headlineMedium)

    }
}