package com.example.homescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homescreen.ui.theme.HomescreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomescreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Homescreen()
                }
            }
        }
    }
}

@Composable
fun Homescreen(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        Text(text = "IRAWAN ROFI HIDAYAT",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(13.dp))
        Box1()
        Spacer(modifier = Modifier.padding(13.dp))
        LocnTemp()
        Spacer(modifier = Modifier.padding(13.dp))
        Box2()
    }
}

@Composable
fun Box1(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Blue)) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.gambar1),
                contentDescription = null, modifier = Modifier.size(280.dp))
            Text(
                text = "Panas Neraka Cuy",
                color = Color.White,
            )
        }

    }
}

@Composable
fun LocnTemp(){
    Text(text = "48°C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Column{
        Row(
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Yogyakarta",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
        Text(text = "Kasihan, Kabupaten Bantul \nDaerah Istimewa Yogyakarta",
            fontSize = 14.sp, color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.Blue)) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "Humidity",
                        color = Color.LightGray
                    )
                    Text(
                        text = "98%",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White)

                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "Sunrise",
                        color = Color.LightGray
                    )
                    Text(
                        text = "05.00 AM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "UV Index",
                        color = Color.LightGray
                    )
                    Text(
                        text = "9 / 10",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "Sunset",
                        color = Color.LightGray
                    )
                    Text(
                        text = "05.40 PM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomescreenTheme {
        Homescreen()
    }
}