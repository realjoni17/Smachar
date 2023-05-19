package com.android.smachar.mappers

import com.android.smachar.data.dto.ArticleDTO
import com.android.smachar.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
    return map{
        Article(
            content = it.content?:"",
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}