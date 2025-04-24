package com.bingo.newproj2.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calculator_Screen(navController:NavHostController) {
    var fnum by remember{ mutableStateOf(TextFieldValue("")) }
    var snum by remember{ mutableStateOf(TextFieldValue("")) }
    var answer by remember{ mutableStateOf("") }
    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)){
        Text("Answer here",
            color = Color.Black,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,)
        OutlinedTextField(value = fnum,
            onValueChange = {fnum=it},
            label = { Text("Enter your first number:",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) })
        OutlinedTextField(value = snum,
            onValueChange = {snum=it},
            label = { Text("Enter your second number:",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) })
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("+",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("*",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("-",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {},
            modifier = Modifier.width(250.dp)) {
            Text("/",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
    }

}

@Preview
@Composable
private fun Calcprev() {
    Calculator_Screen(rememberNavController())

}