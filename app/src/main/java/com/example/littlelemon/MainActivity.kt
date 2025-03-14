package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainComponent()
        }
    }
}

@Composable
fun MainComponent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0XFF495E57)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = stringResource(id = R.string.description_one),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp
            )

            Image(
                painter = painterResource(id = R.drawable.restaurant_food),
                contentDescription = "",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.Red),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14)),
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(text = stringResource(id = R.string.order))
        }
    }
}