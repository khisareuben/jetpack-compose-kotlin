package com.example.myfirstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button

@Composable
fun AuthFirstScreen(navController: NavController){
  Column(
    modifier = Modifier
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = "Auth First Screen",
      fontSize = 30.sp,
      fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
    Button(modifier = Modifier
      .width(150.dp),
      onClick = {
        navController.navigate(Dest.AuthSecond)
      }) {
      Text(
        text = "Next Screen",
        fontSize = 20.sp,

      )
    }
  }
}


@Composable
fun AuthSecondScreen(navController: NavController){
  Column(
    modifier = Modifier
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = "Auth Second Screen",
      fontSize = 30.sp,
      color = Color.Green,
      fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
    Button(modifier = Modifier
      .width(150.dp),
      onClick = {
        navController.navigate(Dest.DashFirst)
      }) {
      Text(
        text = "Next Screen",
        fontSize = 20.sp
      )
    }
  }
}

@Composable
fun DashFirstScreen(navController: NavController){
  Column(
    modifier = Modifier
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = "Dash First Screen",
      fontSize = 30.sp,
      color = Color.Blue,
      fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
    Button(modifier = Modifier
      .width(150.dp),
      onClick = {
        navController.navigate(Dest.DashSecond)
      }) {
      Text(
        text = "Next Screen",
        fontSize = 20.sp
      )
    }
  }
}

@Composable
fun DashSecondScreen(navController: NavController){
  Column(
    modifier = Modifier
      .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Text(
      text = "Dash Second Screen",
      fontSize = 30.sp,
      color = Color.Yellow,
      fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
    Button(modifier = Modifier
      .width(150.dp),
      onClick = {
        navController.navigate(Dest.AuthFirst)
      }) {
      Text(
        text = "Next Screen",
        fontSize = 20.sp
      )
    }
  }
}

