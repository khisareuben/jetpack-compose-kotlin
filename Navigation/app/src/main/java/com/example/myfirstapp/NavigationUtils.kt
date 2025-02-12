package com.example.myfirstapp

import kotlinx.serialization.Serializable

sealed class SubGraph{
  @Serializable
  data object Auth:SubGraph()
  @Serializable
  data object Dashboard:SubGraph()
}

sealed class Dest{
  @Serializable
  data object AuthFirst:Dest()
  @Serializable
  data object AuthSecond:Dest()
  @Serializable
  data object DashFirst:Dest()
  @Serializable
  data object DashSecond:Dest()
}