package com.cho.chouitestplayground.data.source

import com.cho.chouitestplayground.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?

    fun getMovies(): List<Movie>
}