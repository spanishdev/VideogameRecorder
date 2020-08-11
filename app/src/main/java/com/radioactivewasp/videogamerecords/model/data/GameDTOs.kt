package com.radioactivewasp.videogamerecords.model.data

data class PlatformDTO(val name: String)
data class CompanyDTO(val name: String, val description: String)
data class InvolvedCompanyDTO(val name: String, val description: String)
data class GameDTO(
    val name: String,
    val cover: String,
    val involved_company: InvolvedCompanyDTO,
    val summary: String,
    val total_rating: Double,
    val storyline: String,
    val platform: Platform
)