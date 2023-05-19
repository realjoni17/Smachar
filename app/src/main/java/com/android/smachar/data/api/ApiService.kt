package com.android.smachar.data.api

import com.android.smachar.data.dto.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country:String="us",
        @Query("apiKey") apiKey:String="f11bedb84c254537bef81192f7d0b0bc"
    ): Response<NewsDTO>
}