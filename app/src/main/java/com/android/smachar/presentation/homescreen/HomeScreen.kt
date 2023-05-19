package com.android.smachar.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.smachar.presentation.homescreen.components.NewsItem
import com.android.smachar.presentation.homescreen.components.TopAppBar

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
              TopAppBar()
        NewsItem()
    }
}


