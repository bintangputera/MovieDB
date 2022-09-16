package com.bintangpoetra.movieapp.presentation.home.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.bintangpoetra.movieapp.domain.movie.model.Movie

@Composable
fun MovieListItem(movie: Movie) {

    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 0.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Row {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(top = 16.dp)
            ) {
                Text(text = movie.title, style = MaterialTheme.typography.h6)
                Text(text = movie.voteAverage.toString(), style = MaterialTheme.typography.caption)
            }
        }
    }
}