package com.steve_md.androidlibrarydemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.steve_md.androidlibrarydemo.ui.theme.AndroidLibraryDemoTheme
import com.steve_md.productitem.ProductItem


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AndroidLibraryDemoTheme {
               Box(modifier = Modifier.fillMaxSize()) {

               }
            }
        }
    }
}
