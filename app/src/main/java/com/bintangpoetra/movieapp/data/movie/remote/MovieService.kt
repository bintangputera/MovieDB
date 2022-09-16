package com.bintangpoetra.movieapp.data.movie.remote

import com.bintangpoetra.movieapp.BuildConfig
import com.bintangpoetra.movieapp.data.lib.MovieResponse
import com.bintangpoetra.movieapp.data.movie.model.MovieItem
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ) : MovieResponse<MovieItem>

    @GET("movie/now_playing")
    suspend fun getPlayingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ) : MovieResponse<MovieItem>

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ) : MovieResponse<MovieItem>

    @GET("search/movie")
    suspend fun getMovieByQuery(
        @Query("query") query: String,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY
    ): MovieResponse<MovieItem>
}