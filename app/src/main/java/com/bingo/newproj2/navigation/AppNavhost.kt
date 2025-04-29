package com.bingo.newproj2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.ui.theme.screens.calculator.Calculator_Screen
import com.bingo.newproj2.ui.theme.screens.dashboard.Dashboard_Screen
import com.bingo.newproj2.ui.theme.screens.home.Home_Screen
import com.bingo.newproj2.ui.theme.screens.intent.Intent_Screen
import com.bingo.newproj2.ui.theme.screens.login.Login_screen
import com.bingo.newproj2.ui.theme.screens.myapp.MyAppScreen
import com.bingo.newproj2.ui.theme.screens.register.Register_Screen
import com.bingo.newproj2.ui.theme.screens.splash.Splash_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {
     NavHost(modifier = modifier,
        navController = navController,
        startDestination = startDestination){
         composable(ROUTE_SPLASH){
             Splash_Screen(navController)
         }
         composable(ROUTE_HOME){
             Home_Screen(navController)
         }
         composable(ROUTE_LOGIN){
             Login_screen(navController)
         }
         composable(ROUTE_REGISTER){
             Register_Screen(navController)
         }
         composable (ROUTE_MYAPP){
             MyAppScreen(navController)
         }
         composable(ROUTE_CALCULATOR){
             Calculator_Screen(navController)
         }
         composable(ROUTE_INTENT){
             Intent_Screen(navController)
         }
         composable(ROUTE_DASHBOARD){
             Dashboard_Screen(navController)
         }


     }

    
}