package com.android.smachar.presentation.homescreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.android.smachar.domain.model.Article
import com.android.smachar.ui.theme.Shapes


@Composable
fun ArticleItem(it: Article) {
    Card() {
        Column(modifier = Modifier.background(color = bgcolor)) {
            Image(
                painter = rememberAsyncImagePainter(model = it.urlToImage),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(5.dp))
                    .height(300.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = it.title,
                style = TextStyle(
                    color = txtcolor,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                ),
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}
val bgcolor = Color(0xFF9792E3)
val txtcolor = Color(0xFF48435C)
