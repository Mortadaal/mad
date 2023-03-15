package com.example.myfirsapplication

sealed class Screen(val route:String){
    object FriendScreen:Screen("friend_screen")
    object HomeScreen:Screen("home_screen")
    object FriendDetailScreen:Screen("friend_detaile_screen")
}
