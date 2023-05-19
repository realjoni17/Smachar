package com.android.smachar.data.api

data class NewsDTO(
    val articles: List<ArticleDTO>,
    val status: String?,
    val totalResults: Int?
)
