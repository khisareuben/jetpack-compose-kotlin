package com.example.myapplication.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun HomeScreen(navController: NavController) {
  Surface(
    modifier = Modifier.fillMaxSize(),
    color = MaterialTheme.colorScheme.background
  ) {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(15.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(200.dp)
          .padding(horizontal = 15.dp, vertical = 10.dp)
          .clip(MaterialTheme.shapes.large)
      ) {
        Image(
          painter = painterResource(R.drawable.logo),
          contentDescription = "home_screen_bg",
          contentScale = ContentScale.Crop,
          modifier = Modifier.fillMaxSize()
        )
      }
      Text(
        "Home Screen",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(vertical = 20.dp)
      )
    }
  }
}
