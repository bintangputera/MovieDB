package com.bintangpoetra.movieapp.di.feature

import com.bintangpoetra.movieapp.data.movie.MovieDataStore
import com.bintangpoetra.movieapp.data.movie.MovieRepository
import com.bintangpoetra.movieapp.domain.movie.MovieInteractor
import com.bintangpoetra.movieapp.domain.movie.MovieUseCase
import com.bintangpoetra.movieapp.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieModule = module {

    factory<MovieUseCase> { MovieInteractor(get()) }
    factory<MovieRepository> { MovieDataStore(get()) }

    single { MovieDataStore(get()) }
    single { MovieInteractor(get()) }

    viewModel { HomeViewModel(get()) }

}