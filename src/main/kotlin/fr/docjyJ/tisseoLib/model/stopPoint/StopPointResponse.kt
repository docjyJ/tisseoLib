package fr.docjyJ.tisseoLib.model.stopPoint

import java.util.Date

data class StopPointResponse (
        val expirationDate: Date,
        val physicalStops: StopPoints
)
