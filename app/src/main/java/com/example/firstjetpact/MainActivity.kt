package com.example.firstjetpact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstjetpact.ui.theme.FirstJetPactTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.example.firstjetpact.ui.widget.MyBottomAppBar
import com.example.firstjetpact.ui.widget.MyFloatButton
import com.example.firstjetpact.ui.widget.MyTopAppBar
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)

    //var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJetPactTheme {
                var counter by remember { mutableStateOf(0) }
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFF7F7F7),
                    topBar = {
                        MyTopAppBar(title = "JetPact Training")
                    },
                    /*bottomBar =  {
                        MyBottomAppBar()
                    },*/
                    floatingActionButton = {
                        Row {
                            MyFloatButton(
                                onClick = {
                                // Increment the counter when FloatingActionButton is clicked
                                    counter = 0
                                },
                                icon = Icons.Outlined.Refresh
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                            MyFloatButton(
                                onClick = {
                                // Increment the counter when FloatingActionButton is clicked
                                    counter++
                                },
                                icon = Icons.Outlined.Add
                            )
                        }
                    }

                ) { innerPadding ->

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "You have clicked",
                            fontSize = 16.sp,
                            //fontWeight = FontWeight.Bold
                        )
                        Text(
                            counter.toString(),
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}