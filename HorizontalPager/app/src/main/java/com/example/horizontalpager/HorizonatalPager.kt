package com.example.horizontalpager

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Pager(modifier: Modifier = Modifier) {
    val pictures = listOf(
        painterResource(id = R.drawable.tashi1),
        painterResource(id = R.drawable.tashi2),
        painterResource(id = R.drawable.tashi3),
        painterResource(id = R.drawable.tashi4),
        painterResource(id = R.drawable.tashi5),
        painterResource(id = R.drawable.tashi6),
    )
    val pagerState = rememberPagerState(pageCount = {pictures.size})

    HorizontalPager(state = pagerState) { page ->
        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .border(2.dp, Color.Transparent, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp)),
            painter = pictures[page],
            contentDescription = "Tashi",
            contentScale = ContentScale.Crop
        )

    }


}