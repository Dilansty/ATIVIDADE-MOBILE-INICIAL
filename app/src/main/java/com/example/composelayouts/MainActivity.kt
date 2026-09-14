package com.example.composelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelayouts.ui.theme.ComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeLayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   LayoutScreen(modifier = Modifier.padding(innerPadding))
//                    Box(modifier = Modifier
//                        .padding(innerPadding)
//                        .background(Color.Magenta)
//                        .size(
//                            width = 200.dp,
//                            height = 300.dp
//                        ),
//                        contentAlignment = Alignment.CenterStart
//                    ){
//                        Text("Aula android")
//                        Text("Com JetPack Compose",
//                            modifier = Modifier.align(Alignment.BottomCenter))
//                    }

                }
            }
        }
    }
}

@Composable
fun LayoutScreen(modifier: Modifier){
    Column(
        modifier = modifier
            .background(Color.Green)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("texto 1")
        Text("texto 2")
        Text("texto 3")

    }
}


