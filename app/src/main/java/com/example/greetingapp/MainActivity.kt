package com.example.greetingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingapp.ui.theme.GreetingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingAppTheme {
//                GreetingText(
//                    message = "Happy Birthday Sam!",
//                    from = "From Emma",
//                    modifier = Modifier.padding(8.dp)
//                )


            }
        }
    }
}

@Composable

fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {


    Column(verticalArrangement = Arrangement.Center) {

        Text(
            text = message,
            fontSize = 50.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            lineHeight = 116.sp,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier
                .padding(8.dp)
                .align(alignment = Alignment.End)


        )
    }


}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {

    val image = painterResource(
        R.drawable.mybirthday
    )

    Box {
        Image(
            painter = image,
            contentDescription = null
        )

        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)

        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingAppTheme {


        GreetingImage(
            message = "Happy Birthday",
            from = "Juliet"

        )

    }
}