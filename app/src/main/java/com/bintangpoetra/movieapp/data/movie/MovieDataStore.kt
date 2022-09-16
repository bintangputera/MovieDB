package com.bintangpoetra.movieapp.data.movie

import com.bintangpoetra.movieapp.data.lib.Result
import com.bintangpoetra.movieapp.data.movie.remote.MovieService
import com.bintangpoetra.movieapp.domain.movie.mapper.toDomain
import com.bintangpoetra.movieapp.domain.movie.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MovieDataStore(
    private val service: MovieService
): MovieRepository {

    override fun getPlayingMovies(): Flow<Result<List<Movie>>> = flow {
        try {
            emit(Result.loading())

            val response = service.getPlayingMovies()
            val movieList = response.results.toDomain()
            if (movieList.isNotEmpty()) {
                emit(Result.success(movieList))
            } else {
                emit(Result.empty())
            }
        } catch (ex: Exception) {
            emit(Result.failed(ex))
        }
    }

    override fun getUpcomingMovies(): Flow<Result<List<Movie>>> = flow {
        try {
            emit(Result.loading())

            val response = service.getUpcomingMovies()
            val movieList = response.results.toDomain()
            if (movieList.isNotEmpty()) {
                emit(Result.success(movieList))
            } else {
                emit(Result.empty())
            }
        } catch (ex: Exception) {
            emit(Result.failed(ex))
        }
    }

    override fun getPopularMovies(): Flow<Result<List<Movie>>> = flow {
        try {
            emit(Result.loading())

            val response = service.getPopularMovies()
            val movieList = response.results.toDomain()
            print("Movie domain $movieList")
            if (movieList.isNotEmpty()) {
                emit(Result.success(movieList))
            } else {
                emit(Result.empty())
            }
        } catch (ex: Exception) {
            emit(Result.failed(ex))
        }
    }

    override fun getMovieByQuery(query: String): Flow<Result<List<Movie>>> = flow {
        try {
            emit(Result.loading())

            val response = service.getMovieByQuery(query)
            val movieList = response.results.toDomain()
            if (movieList.isNotEmpty()) {
                emit(Result.success(movieList))
            } else {
                emit(Result.empty())
            }
        } catch (ex: Exception) {
            emit(Result.failed(ex))
        }
    }
}