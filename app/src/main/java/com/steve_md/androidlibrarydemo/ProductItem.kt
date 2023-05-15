package com.steve_md.androidlibrarydemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp


@Composable
fun ProductItem(
    image: Painter,
    description: String = "",
    contentDescription: String =""
) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
       Box(
          modifier = Modifier
              .shadow(10.dp, RoundedCornerShape(4.dp))
       ) {
           Image(
               painter =  image,
               contentDescription = contentDescription
           )
           Text(
               modifier = Modifier
                   .align(Alignment.BottomCenter)
                   .background(Color.LightGray),
               text = description,
           )
       }
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = description,
        )
    }

}