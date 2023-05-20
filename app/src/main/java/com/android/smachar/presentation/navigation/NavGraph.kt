package com.android.smachar.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.smachar.presentation.homescreen.HomeScreen
import com.android.smachar.presentation.splash_screen.SplashScreen

@Composable
fun NavGraph(navcontroller:NavHostController = rememberNavController()){
    NavHost(navController = navcontroller, startDestination = Screens.SplashScreen.route){
        composable(route = Screens.SplashScreen.route){
            SplashScreen(navcontroller = navcontroller)
        }
        composable(route = Screens.HomeScreen.route){
            HomeScreen(navcontroller = navcontroller)
        }
    }
}