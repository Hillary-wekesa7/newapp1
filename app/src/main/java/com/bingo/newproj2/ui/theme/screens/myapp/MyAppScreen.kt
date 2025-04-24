package com.bingo.newproj2.ui.theme.screens.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.R
import com.bingo.newproj2.navigation.ROUTE_CALCULATOR
import com.bingo.newproj2.navigation.ROUTE_INTENT

@Composable
fun MyAppScreen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)){
        Image(painterResource(id = R.drawable.myapp),
            contentDescription = "sunbreathing",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp))

        Button(onClick = {navController.navigate(ROUTE_CALCULATOR)},
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)

        ) {
            Text("Calculator",
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
            )

        }
        Button(onClick = {navController.navigate(ROUTE_INTENT)},
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)

            ) {
            Text("Intent",
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
            )

        }
    }
}

@Preview
@Composable
private fun Myappprev() {
    MyAppScreen(rememberNavController())

}