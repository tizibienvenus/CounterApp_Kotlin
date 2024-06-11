package com.example.firstjetpact.ui.widget

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun LoginInput() {
    var text by remember { mutableStateOf("Name") }

    TextField(
        value = text,
        onValueChange = { newText -> text = newText },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Name") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(title: String) {
    TopAppBar(
        //modifier = Modifier.fillMaxHeight(),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue, // Background color
            titleContentColor = Color.White // Text color
        ),
        title = { Text(title) }
    )
}

@Composable
fun MyFloatButton(onClick: () -> Unit, icon: ImageVector) {
    FloatingActionButton(containerColor = Color.Blue, contentColor = Color.White , shape = RoundedCornerShape(percent = 100), onClick = onClick) {
        Icon(imageVector = icon, contentDescription = "Add")
    }
}


@Composable
fun MyBottomAppBar() {
    BottomAppBar(
        modifier = Modifier.height(70.dp),
        containerColor = Color.White,
        contentColor = Color.Gray
    ) {
        Row (
            modifier = Modifier.padding(horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Home, contentDescription = "Home")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription = "Home")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "Home")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Home")
            }
        }
    }
}
