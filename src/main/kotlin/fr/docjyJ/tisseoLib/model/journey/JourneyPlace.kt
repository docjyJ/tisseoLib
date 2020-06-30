package fr.docjyJ.tisseoLib.model.journey

data class JourneyPlace (
        val arrivalCity: String,
        val arrivalLatitude: Float,
        val arrivalLongitude: Float,
        val arrivalStop: String,
        val departureCity: String,
        val departureLatitude: Float,
        val departureLongitude: Float,
        val departureStop: String
)
