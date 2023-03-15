package com.example.myfirsapplication

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.myfirsapplication.ui.theme.MyFirsApplicationTheme
import kotlinx.coroutines.launch
private const val TAG = "Friend"
@Composable
fun FriendScreen(navController: NavController) {
    MyFirsApplicationTheme{

        val scaffoldState= rememberScaffoldState()
        val scope= rememberCoroutineScope()
        Scaffold(

            scaffoldState = scaffoldState,
            topBar = {
                AppBar(
                    onNavigationIconClick = {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            },

            drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
            drawerContent = {

                DrawerHeader()
                DrawerBody(
                    items = listOf(
                        MenuItem(
                            id="home",
                            title = "Home",
                            contentDescription = "Go to Home Screen",
                            icon = Icons.Default.Home
                        ),
                        MenuItem(
                            id="friends",
                            title = "Friends",
                            contentDescription = "Go to Friends Screen",
                            icon = Icons.Default.Person
                        )
                    ),
                    onItemClick ={


                        when(it.id){
                            "home" -> navController.navigate(Screen.HomeScreen.route)
                            "friends" -> navController.navigate(Screen.FriendScreen.route)
                        }
                        print("Clicked on ${it.title}")
                    }
                )
            }
        ) {


            FriendList(
                    items = listOf(
                        Friend(
                            id=1,
                            firstname = "Mortada",
                            lastname = "Almosawi",
                            address = "Nyringen4",
                            zipcode = "8240"
                        ),
                        Friend(
                            id=2,
                            firstname = "Ali",
                            lastname = "Almosawi",
                            address = "Nyringen4",
                            zipcode = "8240"
                        )

            ),
                onItemClick = {
                    when(it.id){
                        1->navController.navigate(Screen.FriendDetailScreen.route)
                        2->navController.navigate(Screen.FriendDetailScreen.route)

                    }
                    Log.v(TAG,it.firstname);
                }
            )

        }

    }



}