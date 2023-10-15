package com.example.tugasfilsafat.navigation

sealed class Screen (val route: String){
    object SplashScreen : Screen("splash")
    object Home : Screen("home")
    object Generate : Screen("generate")
}