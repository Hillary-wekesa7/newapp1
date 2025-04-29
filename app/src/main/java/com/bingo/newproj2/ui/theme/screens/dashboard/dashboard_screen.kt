package com.bingo.newproj2.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bingo.newproj2.R
import com.bingo.newproj2.navigation.ROUTE_HOME
import com.bingo.newproj2.navigation.ROUTE_INTENT
import com.bingo.newproj2.ui.theme.newcolor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard_Screen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(newcolor)){

        Box (){
//            Card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(Color.Magenta)
            ){
                TopAppBar(
                    title = { Text("Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                        }
                    },
                )
                Text("A mall or shopping center is a large building that is full of many smaller shops and stores. It is different from earlier markets or bazaars because most of ...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )



            }
//            end of card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)
            ){
//                Contents of card

                Image(
                    painter = painterResource(R.drawable.mall1),
                    contentDescription = "home",
                    modifier=Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column (){
                    Text("",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
//                End of column
            }
        }
//        End of box

Spacer(modifier = Modifier.height(100.dp))

//Row
Row (modifier = Modifier.padding(20.dp)){
//    Card1
    Card (
        modifier = Modifier
            .width(150.dp)
            .height(180.dp)
            .clickable { navController.navigate(ROUTE_HOME) },
        elevation = CardDefaults.cardElevation()
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.icon1),
                contentDescription = "home",
                modifier = Modifier.size(100.dp)
            )
            Text("Home", fontSize = 15.sp)
        }

    }

//    End of card1
    Spacer(modifier = Modifier.width(20.dp))
//card2
Card (
    modifier = Modifier
        .width(150.dp)
        .height(180.dp)
        .clickable { navController.navigate(ROUTE_INTENT) },
    elevation = CardDefaults.cardElevation()
){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.mall2),
            contentDescription = "home",
            modifier=Modifier.size(100.dp)
        )
        Text("About",
            fontSize = 15.sp)
    }

}

//    end of card2

}
//        end of row
Spacer(modifier = Modifier.height(20.dp))
Row (modifier = Modifier.padding(20.dp)){
//    card1
    Card (
        modifier = Modifier
            .width(150.dp)
            .height(180.dp)
            .clickable { },
        elevation = CardDefaults.cardElevation()
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.mall3),
                contentDescription = "home",
                modifier = Modifier.size(100.dp)
            )
            Text(text = "Contacts", fontSize = 15.sp)

        }
    }
//    end of card1
    Spacer(modifier = Modifier.width(20.dp))
//    card2
    Card (
        modifier = Modifier
            .width(150.dp)
            .height(180.dp)
            .clickable {  },
        elevation = CardDefaults.cardElevation()
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.mall3),
                contentDescription = "home",
                modifier = Modifier.size(100.dp)
            )
            Text(text = "Products", fontSize = 15.sp)
        }


    }

    //End of Card2



}

        //End of Row
        Row (modifier = Modifier.padding(20.dp)){

            //Card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable {  },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.myapp),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2

            Spacer(modifier = Modifier.width(20.dp))
//Card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable {  },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.mall1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2
}


}

    
}

@Preview
@Composable
private fun dashboardprev() {

    Dashboard_Screen(rememberNavController())
}