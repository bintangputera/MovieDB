package com.bintangpoetra.movieapp.data.movie

import com.bintangpoetra.movieapp.data.lib.Result
import com.bintangpoetra.movieapp.data.movie.model.MovieItem
import com.bintangpoetra.movieapp.domain.movie.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getPlayingMovies(): Flow<Result<List<Movie>>>

    fun getUpcomingMovies(): Flow<Result<List<Movie>>>

    fun getPopularMovies(): Flow<Result<List<Movie>>>

    fun getMovieByQuery(query: String): Flow<Result<List<Movie>>>

}