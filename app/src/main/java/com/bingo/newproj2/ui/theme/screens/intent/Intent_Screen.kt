package com.bingo.newproj2.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navHostController: NavHostController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("Camera",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("sms",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("share",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("Call",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("dail",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("stk",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("email",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }


    }


}

@Preview
@Composable
private fun Intentprev() {
    Intent_Screen(rememberNavController())

}