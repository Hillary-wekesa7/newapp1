package com.bingo.newproj2.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat.Columns
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.R
import com.bingo.newproj2.navigation.ROUTE_LOGIN
import com.bingo.newproj2.navigation.ROUTE_MYAPP
import com.bingo.newproj2.navigation.ROUTE_REGISTER

@Composable
fun Home_Screen(navController: NavHostController) {

    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)) {
        Spacer(modifier = Modifier.height(25.dp))
        Text("Hillary's app",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to my app",
            color = Color.Green,
            fontSize = 34.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier=Modifier.width(400.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan)
        ) {
            Text("Click to login",
                color = Color.Black,
                fontFamily = FontFamily.Monospace,
                fontSize = 24.sp
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_MYAPP)
        },
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.width(400.dp)
        ) {
            Text("MY APP",
                color = Color.Black,
                fontFamily = FontFamily.Monospace,
                fontSize = 24.sp)

        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Cyan)
            ) {
            Text("Click to register",
                fontSize = 24.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black,
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(id= R.drawable.aapp2),
            contentDescription = "Yeager",
            modifier=Modifier
                .size(700.dp)
                .clip(shape = RectangleShape)

        )
    }

}

@Preview
@Composable
private fun Homeprev() {
    Home_Screen(rememberNavController())
}