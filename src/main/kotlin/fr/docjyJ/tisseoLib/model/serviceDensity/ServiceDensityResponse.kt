package fr.docjyJ.tisseoLib.model.serviceDensity

import java.time.LocalDateTime

data class ServiceDensityResponse (
    val distance: String,
    val expirationDate: LocalDateTime,
    val isServiceNumberReached: Boolean,
    val serviceNumberReached: Int,
    val stops: List<StopsServices>
)
