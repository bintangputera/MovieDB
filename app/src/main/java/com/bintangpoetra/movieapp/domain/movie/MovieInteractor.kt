package com.bintangpoetra.movieapp.domain.movie

import com.bintangpoetra.movieapp.data.lib.Result
import com.bintangpoetra.movieapp.data.movie.MovieRepository
import com.bintangpoetra.movieapp.domain.movie.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class MovieInteractor(private val repository: MovieRepository): MovieUseCase {

    override fun getPlayingMovies(): Flow<Result<List<Movie>>> {
        return repository.getPlayingMovies()
            .flowOn(Dispatchers.IO)
    }

    override fun getUpcomingMovies(): Flow<Result<List<Movie>>> {
        return repository.getUpcomingMovies()
            .flowOn(Dispatchers.IO)
    }

    override fun getPopularMovies(): Flow<Result<List<Movie>>> {
        return repository.getPopularMovies()
            .flowOn(Dispatchers.IO)
    }

    override fun getMovieByQuery(query: String): Flow<Result<List<Movie>>> {
        return repository.getMovieByQuery(query)
            .flowOn(Dispatchers.IO)
    }
}