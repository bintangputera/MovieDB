package com.bintangpoetra.movieapp.presentation.home

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.bintangpoetra.movieapp.R.string
import com.bintangpoetra.movieapp.presentation.home.composables.MovieListItem
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = getViewModel()
) {

    val movies by viewModel.movieList.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Text(text = stringResource(string.label_upcoming_movie))
            LazyColumn(content = {
                viewModel.getPopularMovies()
            })
        }
    }

    fun showMessage(context: Context, message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}

















