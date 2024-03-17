package com.example.boxgetterssettersdelegatesweek5acc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.boxgetterssettersdelegatesweek5acc.ui.theme.BoxGettersSettersDelegatesWeek5AccTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxLayoutExample()
        }
    }
}

@Composable
fun BoxLayoutExample(){
    Box(Modifier.fillMaxSize()) {//Create Box
        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.BottomStart) // Alignment places on Box Layout
        ) { Text("Bottom Start") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.BottomCenter)
        ) { Text("Bottom") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.BottomEnd)
        ) { Text("Bottom End") }


        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.CenterStart)
        ) { Text("Centre Start") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.Center)
        ) { Text("Centre") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.CenterEnd)
        ) { Text("Centre End") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.TopStart)
        ) { Text("Top Start") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.TopCenter)
        ) { Text("Top") }

        Button(
            onClick = { }, modifier =
            Modifier.align(Alignment.TopEnd)
        ) { Text("Top End") }
    }
}