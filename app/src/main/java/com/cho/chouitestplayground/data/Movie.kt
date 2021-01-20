package com.cho.chouitestplayground.data

data class Movie (
    val id: Int,
    val title: String,
    val image: Int,
    val description: String,
    val directors: ArrayList<String>?,
    val star_actors: ArrayList<String>?
)