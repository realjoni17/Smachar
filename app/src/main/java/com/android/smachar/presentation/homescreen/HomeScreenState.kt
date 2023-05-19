package com.android.smachar.presentation.homescreen

import com.android.smachar.domain.model.Article

data class HomeScreenState(
    val isLoading:Boolean=false,
    val data:List<Article>?=null,
    val error:String=""
)
