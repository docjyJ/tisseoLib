package fr.docjyJ.tisseoLib.model.journey

import java.time.LocalDateTime

data class TimeBounds (
        val maxDepartureHour: LocalDateTime,
        val minArrivalHour: LocalDateTime
)
