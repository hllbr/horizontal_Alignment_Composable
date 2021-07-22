package com.example.horizontal_alignment_composable

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.horizontal_alignment_composable.ui.theme.Horizontal_Alignment_ComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Horizontal_Alignment_ComposableTheme {
              MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
        ,verticalArrangement = Arrangement.SpaceAround
        ,horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText(name = "android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(name = "kotlin")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(name = "javax")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(modifier = Modifier.fillMaxWidth()
        ,horizontalArrangement = Arrangement.SpaceEvenly
        ,verticalAlignment = Alignment.CenterVertically) {
            CustomText(name = "TEST_v1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(name = "Tring_V2.1.0 <3")
        }
    }

    
}
@Composable
fun CustomText(name:String){
    Text(modifier = Modifier
        .background(color = Color.White)
        ,text = "Hello $name!",color = Color.Gray
        ,fontStyle = FontStyle.Normal
        ,fontWeight = FontWeight.Black
        ,fontSize = 20.sp
        ,overflow = TextOverflow.Visible)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
MainScreen()
}