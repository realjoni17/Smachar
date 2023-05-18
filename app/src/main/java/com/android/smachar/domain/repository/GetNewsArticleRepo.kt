package com.android.smachar.domain.repository

import com.android.smachar.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle():List<Article>
}