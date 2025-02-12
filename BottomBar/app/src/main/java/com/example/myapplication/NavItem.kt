package com.example.myapplication

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

// 1st step
@Serializable
sealed class Screens(val route : String) {
  @Serializable
  data object Home : Screens("home_route")
  @Serializable
  data object Search : Screens("search_route")
  @Serializable
  data object Profile : Screens("profile_route")
}

// 2nd step
//initializing the data class with default parameters
data class BottomNavigationItem(
  val label : String,
  val icon : ImageVector,
  val route : String
)

// 3rd step
var BottomNavigationItems = listOf(
      BottomNavigationItem(
        label = "Home",
        icon = Icons.Filled.Home,
        route = Screens.Home.route
      ),
      BottomNavigationItem(
        label = "Search",
        icon = Icons.Filled.Search,
        route = Screens.Search.route
      ),
      BottomNavigationItem(
        label = "Profile",
        icon = Icons.Filled.AccountCircle,
        route = Screens.Profile.route
      ),
    )
