package fr.docjyJ.tisseoLib.model.journey

import java.util.Date

data class TimeBounds (
        val maxDepartureHour: Date,
        val minArrivalHour: Date
)
