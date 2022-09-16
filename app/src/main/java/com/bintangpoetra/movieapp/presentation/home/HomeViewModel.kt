package com.bintangpoetra.movieapp.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bintangpoetra.movieapp.data.lib.Result
import com.bintangpoetra.movieapp.domain.movie.MovieUseCase
import com.bintangpoetra.movieapp.domain.movie.model.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val movieUseCase: MovieUseCase): ViewModel() {

    private val _movieList = MutableStateFlow<Result<List<Movie>>>(Result.loading())
    val movieList: StateFlow<Result<List<Movie>>> = _movieList.asStateFlow()

    fun getPopularMovies() = viewModelScope.launch {
        movieUseCase.getPopularMovies()
            .collect {
                _movieList.value = it
            }
    }

}