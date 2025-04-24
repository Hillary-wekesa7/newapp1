package com.bingo.newproj2.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.navigation.ROUTE_LOGIN
import com.bingo.newproj2.navigation.ROUTE_REGISTER
import com.bingo.newproj2.ui.theme.screens.login.Login_screen

@Composable
fun Register_Screen(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)){
        Text("Registration Screen",
            color = Color.White,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = { Text("Enter your email",
                color = Color.Green,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) })
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = { Text("Enter your password",
                color = Color.Green,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) })
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {},
            modifier = Modifier.width(250.dp),

            ) {
            Text("Click to register",
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
            )
        }
        Text(" Have an account? Click to login",
            modifier = Modifier
                .clickable { navController.navigate(ROUTE_LOGIN) })




    }

}
@Preview
@Composable
private fun RegisterPrev() {
    Register_Screen(rememberNavController())

}