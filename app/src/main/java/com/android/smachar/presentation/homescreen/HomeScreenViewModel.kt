package com.android.smachar.presentation.homescreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.smachar.common.Resource
import com.android.smachar.domain.use_cases.GetNewsArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {

    val articles = mutableStateOf(HomeScreenState())


    init {
        getNewsArticles()
    }

    fun getNewsArticles(){
        getNewsArticleUseCase().onEach {
            when(it){
                is Resource.Loading->{
                    articles.value = HomeScreenState(isLoading = true)
                }
                is Resource.Success->{
                    articles.value = HomeScreenState(data = it.data)
                }
                is Resource.Error->{
                    articles.value = HomeScreenState(error = it.message.toString())
                }
            }
        }.launchIn(viewModelScope)
    }


}