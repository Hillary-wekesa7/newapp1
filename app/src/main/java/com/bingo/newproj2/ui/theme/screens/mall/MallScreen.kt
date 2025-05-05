package com.bingo.newproj2.ui.theme.screens.mall

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BadgeDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.R
import com.bingo.newproj2.navigation.ROUTE_HOME
import com.bingo.newproj2.ui.theme.newcolor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Mall_Screen(navController: NavHostController) {
//    Scaffold

    var selectedIndex by remember { mutableStateOf(0) }
    Scaffold(
//        BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Magenta,
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home") },
                    label = { Text("Add") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        navController.navigate(ROUTE_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
            }
        },
//        floatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.Gray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
//        Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {

                Box() {
//                    main contents of the page
                    Card(
                        modifier = Modifier.fillMaxSize().height(400.dp),
                        shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp),
                        colors = CardDefaults.cardColors()
                    ) {
                        Text(text = "Hi", fontSize = 20.sp)
                        Text(text = "How are you?", fontSize = 20.sp)
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "Here are your projects")


                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            modifier = Modifier.fillMaxSize()
                                .horizontalScroll(rememberScrollState())
                        ) {
                            //Row
                            Row(modifier = Modifier.padding(10.dp)) {


                                //Card1
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(Color.Blue)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(10.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.mall1),
                                            contentDescription = "home",
                                            modifier = Modifier.size(80.dp)
                                        )
                                        Text(text = "Cryptocurrency", fontSize = 14.sp)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Landing Page", fontSize = 14.sp)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "12 Links", fontSize = 14.sp)


                                    }


                                }

                                //End of Card1
                                Spacer(modifier = Modifier.width(10.dp))

                                //Card2
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(Color.Yellow)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(20.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.mall2),
                                            contentDescription = "",
                                            modifier = Modifier.size(80.dp),


                                            )
                                        Text(text = "Statistics", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Text(text = "Dashboard", fontSize = 15.sp)
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = "12 Links", fontSize = 15.sp)

                                    }


                                }

                                //End of Card2
                                Spacer(modifier = Modifier.width(10.dp))
                                //Card2
                                Card(
                                    modifier = Modifier
                                        .width(150.dp)
                                        .height(300.dp)
                                        .clickable { navController.navigate(ROUTE_HOME) },
                                    elevation = CardDefaults.cardElevation(),
                                    colors = CardDefaults.cardColors(Color.Green)
                                ) {
                                    Column(
                                        modifier = Modifier.fillMaxSize()
                                            .padding(30.dp),
                                        horizontalAlignment = Alignment.Start,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.mall3),
                                            contentDescription = "home",
                                            modifier = Modifier.size(80.dp)
                                        )
                                        Text(text = "About", fontSize = 15.sp)
                                    }


                                }

                                //End of Card2
                            }
                        }

                        //End of Row

                        Spacer(modifier = Modifier.height(20.dp))

//Card
//End of Card




                    }


                }


                Column (modifier = Modifier.fillMaxSize()
                    .verticalScroll(rememberScrollState())
                ) {

                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = "Personal Tasks",
                        fontSize = 15.sp
                    )


                    //Row
                    Row(modifier = Modifier.padding(20.dp)) {



                        //Card1
                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center

                            ) {
                                Row (){
                                    Image(
                                        painter = painterResource(R.drawable.mall4),
                                        contentDescription = "home",
                                        modifier = Modifier.width(50.dp).padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column () {
                                        Text(
                                            text = "NDA Review for website project",
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.ExtraBold

                                        )

                                        Text(
                                            text = "Today .10pm",
                                            fontSize = 10.sp
                                        )
                                        Text(
                                            text = "Today .10pm",
                                            fontSize = 10.sp
                                        )
                                    }


                                }




                            }


                        }

                        //End of Card1
                        Spacer(modifier = Modifier.width(8.dp))


                    }

                    //End of Row
                    //Row
                    Row(modifier = Modifier.padding(20.dp)) {

                        //Card1


                        Card(
                            modifier = Modifier
                                .width(400.dp)
                                .height(80.dp)
                                .clickable { },
                            elevation = CardDefaults.cardElevation()
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Row (){
                                    Image(
                                        painter = painterResource(R.drawable.mall1),
                                        contentDescription = "home",
                                        modifier = Modifier.size(50.dp).padding(start = 10.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column() {
                                        Text(
                                            text = "Email Reply for Green Project",
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.ExtraBold

                                        )

                                        Text(
                                            text = "Today .10pm",
                                            fontSize = 10.sp
                                        )
                                    }


                                }
                            }


                        }

                        //End of Card1
                        Spacer(modifier = Modifier.width(20.dp))



                    }

                    //End of Row
                }

            }
        }
    )

    //End of scaffold



}
@Preview
@Composable
private fun Mall_prev() {

    Mall_Screen(rememberNavController())
}