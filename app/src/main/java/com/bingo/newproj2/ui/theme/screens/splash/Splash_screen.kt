package com.bingo.newproj2.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.ui.theme.screens.login.Login_screen
import com.bingo.newproj2.R
import com.bingo.newproj2.navigation.ROUTE_HOME
import com.bingo.newproj2.ui.theme.newcolor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splash_Screen(navController: NavHostController) {
    val coroutine= rememberCoroutineScope()
    coroutine.launch {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }

    Column (modifier = Modifier
            .fillMaxSize()
            .background(color = newcolor),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(id= R.drawable.splash),
            contentDescription = "Jinwoo",
            modifier=Modifier
                .height(600.dp)
                .width(300.dp)
                .clip(shape = RoundedCornerShape(10)))
        Text("Welcome",
            fontSize = 100.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.LightGray
        )

    }
}
@Preview
@Composable
private fun SplashPrev() {
    Splash_Screen(rememberNavController())

}