package com.android.smachar.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.android.smachar.presentation.homescreen.components.NewsItem
import com.android.smachar.presentation.homescreen.components.TopAppBar

@Composable
fun HomeScreen(navcontroller: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = bgcolor1
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar()
            NewsItem()
        }
    }
}
val bgcolor1 = Color(0xFF5A5766)


