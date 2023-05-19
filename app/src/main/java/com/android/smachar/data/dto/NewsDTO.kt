package com.android.smachar.data.dto

data class NewsDTO(
    val articles: List<ArticleDTO>,
    val status: String?,
    val totalResults: Int?
)
