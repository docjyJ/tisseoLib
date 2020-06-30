package fr.docjyJ.tisseoLib.model.stopPoint

import java.time.LocalDateTime

data class StopPointResponse (
        val expirationDate: LocalDateTime,
        val physicalStops: StopPoints
)
