package com.android.smachar.presentation.splash_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.android.smachar.presentation.navigation.Screens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navcontroller:NavController){
    LaunchedEffect(key1 = true){
        delay(2000L)
        navcontroller.navigate(Screens.HomeScreen.route){
            popUpTo(Screens.SplashScreen.route){
                inclusive = true
            }
        }

    }
    Splash()
}