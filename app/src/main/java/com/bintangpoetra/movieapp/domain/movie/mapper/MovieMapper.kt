package com.bintangpoetra.movieapp.domain.movie.mapper

import com.bintangpoetra.movieapp.data.movie.model.MovieItem
import com.bintangpoetra.movieapp.domain.movie.model.Movie
import com.bintangpoetra.movieapp.utils.ext.emptyString
import com.bintangpoetra.movieapp.utils.ext.orZero

fun MovieItem.toDomain(): Movie =
    Movie(
        id = id.orZero(),
        title = title ?: emptyString(),
        overview = overview ?: emptyString(),
        posterPath = overview ?: emptyString(),
        voteAverage = voteAverage.orZero(),
        adult = adult ?: true
    )

fun List<MovieItem>.toDomain(): List<Movie> {
    return this.map {
        it.toDomain()
    }
}
