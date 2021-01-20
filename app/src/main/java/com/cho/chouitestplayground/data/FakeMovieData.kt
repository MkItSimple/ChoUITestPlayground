package com.cho.chouitestplayground.data

import com.cho.chouitestplayground.R


object FakeMovieData {

    const val FAKE_NETWORK_DELAY = 1000L

    // Dummy Description
    const val DESC_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

    val movies = arrayOf(
        Movie(
            0,
            "Avengers Endgame",
            R.drawable.endgame_h,
            DESC_1,
            arrayListOf("Anthony Russo", "Joe Russo"),
            arrayListOf("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", "+ more...")
        ),
        Movie(
            1,
            "Mulan",
            R.drawable.mulan_h,
            DESC_1,
            arrayListOf("R.J. Stewart", "James Vanderbilt"),
            arrayListOf(
                "Dwayne Johnson",
                "Seann William Scott",
                "Rosario Dawson",
                "Christopher Walken"
            )
        ),
        Movie(
            2,
            "Incredible Hulk",
            R.drawable.hulk_h,
            DESC_1,
            arrayListOf("Francis Ford Coppola"),
            arrayListOf("Marlon Brando", "Al Pacino", "James Caan")
        ),
        Movie(
            3,
            "Spiderman Homecoming",
            R.drawable.spiderman_h,
            DESC_1,
            arrayListOf("Christopher Nolan"),
            arrayListOf("Christian Bale", "Heath Ledger", "Aaron Eckhart")
        ),
        Movie(
            4,
            "Black Panther",
            R.drawable.blackpanter_h,
            DESC_1,
            arrayListOf("Peter Jackson"),
            arrayListOf("Elijah Wood", "Viggo Mortensen", "Ian McKellen")
        )
    )
}