package com.cho.chouitestplayground.data

import com.cho.chouitestplayground.R


object FakeMovieData {

    const val FAKE_NETWORK_DELAY = 1000L

    val movies = arrayOf(
        Movie(
            0,
            "Incredible Hulk",
            R.drawable.hulk_h,
            "The Avengers and their allies must be willing to sacrifice all in an attempt to " +
                    "defeat the powerful Thanos before his blitz of devastation and ruin puts an end to " +
                    "the universe.",
            arrayListOf("Louis Leterrier"),
            arrayListOf("Lou Ferrigno", "Edward Norton", "Liv Tyler", "Tim Roth")
        ),
        Movie(
            1,
            "Spiderman Homecoming",
            R.drawable.spiderman_h,
            "A tough aspiring chef is hired to bring home a mobster's son from the Amazon but " +
                    "becomes involved in the fight against an oppressive town operator and the search " +
                    "for a legendary treasure.",
            arrayListOf("Jon Watts"),
            arrayListOf("Tom Holland", "Zendaya", "Michael Keaton", "Marisa Tomei")
        ),
        Movie(
            2,
            "Black Panther",
            R.drawable.blackpanter_h,
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            arrayListOf("Ryan Coogler"),
            arrayListOf("Chadwick Boseman", "Michael B. Jordan", "Lupita Nyong'o", "Danai Gurira")
        ),
        Movie(
            3,
            "Mulan",
            R.drawable.mulan_h,
            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
            arrayListOf("Niki Caro"),
            arrayListOf("Lui Yifei", "Jet Li", "Donnie Yen", "Yoson An"
            )
        ),
        Movie(
            4,
            "Avengers Endgame",
            R.drawable.endgame_h,
            "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
            arrayListOf("Joe Russo", "Anthony Russo"),
            arrayListOf("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", "+ more...")
        )

//        Movie(
//            0,
//            "Avengers: Infinity War",
//            R.drawable.a_avengers,
//            "The Avengers and their allies must be willing to sacrifice all in an attempt to " +
//                    "defeat the powerful Thanos before his blitz of devastation and ruin puts an end to " +
//                    "the universe.",
//            arrayListOf("Anthony Russo", "Joe Russo"),
//            arrayListOf("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", "+ more...")
//        ),
//        Movie(
//            1,
//            "The Rundown",
//            R.drawable.a_rundown,
//            "A tough aspiring chef is hired to bring home a mobster's son from the Amazon but " +
//                    "becomes involved in the fight against an oppressive town operator and the search " +
//                    "for a legendary treasure.",
//            arrayListOf("R.J. Stewart", "James Vanderbilt"),
//            arrayListOf("Dwayne Johnson", "Seann William Scott", "Rosario Dawson", "Christopher Walken")
//        ),
//        Movie(
//            2,
//            "The Godfather",
//            R.drawable.a_father,
//            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
//            arrayListOf("Francis Ford Coppola"),
//            arrayListOf("Marlon Brando", "Al Pacino", "James Caan")
//        ),
//        Movie(
//            3,
//            "The Dark Knight",
//            R.drawable.a_batman,
//            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
//            arrayListOf("Christopher Nolan"),
//            arrayListOf("Christian Bale", "Heath Ledger", "Aaron Eckhart")
//        ),
//        Movie(
//            4,
//            "The Lord of the Rings: The Return of the King",
//            R.drawable.a_ring,
//            "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
//            arrayListOf("Peter Jackson"),
//            arrayListOf("Elijah Wood", "Viggo Mortensen", "Ian McKellen")
//        )
    )
}