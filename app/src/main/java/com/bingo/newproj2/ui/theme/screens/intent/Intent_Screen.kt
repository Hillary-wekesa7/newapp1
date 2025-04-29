package com.bingo.newproj2.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.core.net.toUri

@Composable
fun Intent_Screen(navHostController: NavHostController) {
    val context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Button(onClick = {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)
        },
            modifier = Modifier.width(250.dp)) {
            Text("Camera",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val uri = "smsto:0115958012".toUri()

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            context.startActivity(intent)

        },
            modifier = Modifier.width(250.dp)) {
            Text("sms",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)

        },
            modifier = Modifier.width(250.dp)) {
            Text("share",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val intent = Intent(Intent.ACTION_CALL, ("tel:" + "+254115958012").toUri())

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },
            modifier = Modifier.width(250.dp)) {
            Text("Call",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val phone = "+254115958012"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            modifier = Modifier.width(250.dp)) {
            Text("dail",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            modifier = Modifier.width(250.dp)) {
            Text("stk",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }
        Button(onClick = {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            context.startActivity(emailIntent)
        },
            modifier = Modifier.width(250.dp)) {
            Text("email",
                color = Color.Green,
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif)
        }


    }


}

@Preview
@Composable
private fun Intentprev() {
    Intent_Screen(rememberNavController())

}