package com.bintangpoetra.movieapp.ui.theme.composable

sealed class NavRoutes(val route: String) {

    object Home: NavRoutes("home")
    object MovieDetail: NavRoutes("movieDetail")

}