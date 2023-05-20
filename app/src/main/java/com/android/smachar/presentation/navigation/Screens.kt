package com.android.smachar.presentation.navigation

sealed class Screens (val route: String){
    object SplashScreen : Screens("SplashScreen")
    object HomeScreen : Screens("HomeScreen")
}