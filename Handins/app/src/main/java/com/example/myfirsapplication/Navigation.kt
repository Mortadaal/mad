package com.example.myfirsapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(route = Screen.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.FriendScreen.route
        ){
            FriendScreen(navController=navController)
        }
        composable(route = Screen.FriendDetailScreen.route
        ){
            FriendDetailScreen(navController=navController)
        }
    }
}