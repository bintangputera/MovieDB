package com.bintangpoetra.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bintangpoetra.movieapp.presentation.detail.MovieDetailScreen
import com.bintangpoetra.movieapp.presentation.home.HomeScreen
import com.bintangpoetra.movieapp.ui.theme.MovieAppTheme
import com.bintangpoetra.movieapp.ui.theme.composable.NavRoutes
import com.bintangpoetra.movieapp.utils.BundleKeys.KEY_USERNAME

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background, ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.Home.route) {
        composable(NavRoutes.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(NavRoutes.MovieDetail.route + "/{$KEY_USERNAME}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString(KEY_USERNAME)
            MovieDetailScreen(navController = navController, username)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}