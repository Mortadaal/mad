package com.example.myfirsapplication

import androidx.compose.foundation.Image
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource


@Composable
fun AppBar(
    onNavigationIconClick:()-> Unit
){
    TopAppBar(
        title = {
           Text(text = "Friends Application")

        } ,
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick){
                Image(imageVector = Icons.Default.Menu, contentDescription = "Toggle drawer")
            }
        }

    )

}