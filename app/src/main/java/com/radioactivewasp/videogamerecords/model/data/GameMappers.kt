package com.radioactivewasp.videogamerecords.model.data

fun GameDTO.map(): Game =
    Game(name, cover, involved_company.map(), summary, total_rating, storyline, platform)

fun InvolvedCompanyDTO.map(): InvolvedCompany = InvolvedCompany(name, description)