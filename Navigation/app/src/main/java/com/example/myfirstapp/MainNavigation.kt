package com.example.myfirstapp

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavigation(){
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = SubGraph.Auth,
    enterTransition = { slideInHorizontally { it } },
    exitTransition = { slideOutHorizontally { -it } },
    popEnterTransition = { slideInHorizontally { -it } },
    popExitTransition = { slideOutHorizontally { it } }

  ) {
    navigation<SubGraph.Auth>(startDestination = Dest.AuthFirst) {
      composable<Dest.AuthFirst> {
        AuthFirstScreen(navController)
      }
      composable<Dest.AuthSecond> {
        AuthSecondScreen(navController)
      }
    }

    navigation<SubGraph.Dashboard>(startDestination = Dest.DashFirst) {
      composable<Dest.DashFirst> {
        DashFirstScreen(navController)
      }
      composable<Dest.DashSecond> {
        DashSecondScreen(navController)
      }
    }
  }
}