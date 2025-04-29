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
        Text("my answer is:",
            color = Color.Black,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,)
        Text(answer,
            color = Color.Green,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.background(color = Color.Black))
        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecontnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                answer="Please fill in all detail"
            }else{
                val myanswer=myfirstnum.toDouble() + mysecontnum.toDouble()
                answer=myanswer.toString()
            }
        },
            modifier = Modifier.width(250.dp)) {
            Text("+",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecontnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                answer="Please fill in all detail"
            }else{
                val myanswer=myfirstnum.toDouble() * mysecontnum.toDouble()
                answer=myanswer.toString()
            }
        },
            modifier = Modifier.width(250.dp)) {
            Text("*",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecontnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                answer="Please fill in all detail"
            }else{
                val myanswer=myfirstnum.toDouble() - mysecontnum.toDouble()
                answer=myanswer.toString()
            }
        },
            modifier = Modifier.width(250.dp)) {
            Text("-",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecontnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecontnum.isEmpty()){
                answer="Please fill in all detail"
            }else{
                val myanswer=myfirstnum.toDouble() / mysecontnum.toDouble()
                answer=myanswer.toString()
            }
        },
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