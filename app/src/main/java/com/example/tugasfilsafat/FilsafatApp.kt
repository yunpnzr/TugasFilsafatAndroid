package com.example.tugasfilsafat

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasfilsafat.main.MainScreen
import com.example.tugasfilsafat.navigation.Screen
import com.example.tugasfilsafat.splash.SplashScreen

@Composable
fun FilsafatApp(
    navController: NavHostController = rememberNavController()
){
    val navController= navController
    
    NavHost(navController, startDestination = Screen.SplashScreen.route ){
        composable(Screen.SplashScreen.route){
            SplashScreen(
                navController = navController
            )
        }
        composable(Screen.Home.route){
            MainScreen(
                navController = navController
            )
        }
    }
}