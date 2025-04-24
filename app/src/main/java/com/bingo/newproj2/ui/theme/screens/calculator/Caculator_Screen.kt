package com.bingo.newproj2.ui.theme.screens.calculator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calculator_Screen(navController:NavHostController) {

}

@Preview
@Composable
private fun Calcprev() {
    Calculator_Screen(rememberNavController())

}