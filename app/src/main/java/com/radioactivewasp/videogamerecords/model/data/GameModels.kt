package com.radioactivewasp.videogamerecords.model.data

data class Platform(val name: String)
data class Company(val name: String, val description: String)
data class InvolvedCompany(val name: String, val description: String)
data class Game(
    val name: String,
    val cover: String,
    val company: InvolvedCompany,
    val summary: String,
    val total_rating: Double,
    val storyline: String,
    val platform: Platform
)