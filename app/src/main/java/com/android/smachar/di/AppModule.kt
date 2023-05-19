package com.android.smachar.di

import com.android.smachar.data.api.ApiService
import com.android.smachar.data.repository.GetNewsArticleRepoImpl
import com.android.smachar.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun provideApiService() : ApiService{
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideGetNewsRepo(apiService:ApiService):GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}