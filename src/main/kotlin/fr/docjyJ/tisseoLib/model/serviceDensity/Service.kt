package fr.docjyJ.tisseoLib.model.serviceDensity

import java.time.LocalTime

data class Service (
    val JourneyName: String,
    val LineName: String,
    val departure: LocalTime,
    val id: String,
    val network: String,
    val rollingStock: String
)
