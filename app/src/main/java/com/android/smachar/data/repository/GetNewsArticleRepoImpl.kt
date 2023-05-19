package com.android.smachar.data.repository

import com.android.smachar.common.SafeApiRequest
import com.android.smachar.data.api.ApiService
import com.android.smachar.domain.model.Article
import com.android.smachar.domain.repository.GetNewsArticleRepo
import com.android.smachar.mappers.toDomain
import javax.inject.Inject


class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService)
    : GetNewsArticleRepo, SafeApiRequest(){
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!
    }

}