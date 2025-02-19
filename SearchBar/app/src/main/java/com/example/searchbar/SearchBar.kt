package com.example.searchbar

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {

  var query by remember { mutableStateOf("") }
  var active by remember { mutableStateOf(false) }
  val searchHistory = listOf("Android", "Compose", "Kotlin", "Jetpack", "mobile", "developer")

  SearchBar(
    query = query,
    onQueryChange = {query = it},
    onSearch = { newQuery ->
      println("Search for: $newQuery")
    },
    active = active,
    onActiveChange = {active = it},
    placeholder = { Text("Search") },
    leadingIcon = {
      if (active) {
        IconButton(onClick = {
          active = false
          query = ""
        }) {
          Icon(Icons.AutoMirrored.Default.ArrowBack, contentDescription = "back icon")
        }
      } else {
        Icon(Icons.Default.Search, contentDescription = "search icon")
      }
    },
    trailingIcon = {
      IconButton(onClick = {}) {
        Icon(painter = painterResource(R.drawable.baseline_mic), contentDescription = "mic")
      }
    }
  ) {
    searchHistory.takeLast(6).forEach { item ->
      ListItem(
        headlineContent = { Text(item) },
        modifier = Modifier.clickable { query = item },
        leadingContent = {
          Icon(
            painter = painterResource(R.drawable.baseline_history),
            contentDescription = "history icon"
          )
        }
      )
    }
  }


}