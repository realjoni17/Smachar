package com.android.smachar.domain.use_cases

import com.android.smachar.common.Resource
import com.android.smachar.domain.model.Article
import com.android.smachar.domain.repository.GetNewsArticleRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading(""))
        try{
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))

        }catch (e:Exception){
            emit(Resource.Error(e.message))
        }

    }

}