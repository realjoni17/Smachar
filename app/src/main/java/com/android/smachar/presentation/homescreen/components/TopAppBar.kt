package com.android.smachar.presentation.homescreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBar() {
    Column(modifier = Modifier.fillMaxWidth().height(45.dp)
        .background(color = Color.Transparent)) {
        Text(text = "Smachar", modifier = Modifier
            .align(alignment = Alignment.CenterHorizontally)
            .offset(y = 3.dp),
              fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp,
            color = txtcolor2
        )
    }
}
val txtcolor2 = Color(0xFFEDFFEC)

@Preview
@Composable
fun TopAppBarPrev() {
    TopAppBar()
}