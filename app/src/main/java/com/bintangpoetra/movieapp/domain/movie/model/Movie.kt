package com.bintangpoetra.movieapp.domain.movie.model

import android.os.Parcelable
import com.bintangpoetra.movieapp.utils.ext.emptyString
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: Int = 0,
    val title: String = emptyString(),
    val overview: String = emptyString(),
    val posterPath: String = emptyString(),
    val voteAverage: Double = 0.0,
    val adult: Boolean = false
) : Parcelable
