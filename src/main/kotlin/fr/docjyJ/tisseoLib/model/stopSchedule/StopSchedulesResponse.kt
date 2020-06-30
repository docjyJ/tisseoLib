package fr.docjyJ.tisseoLib.model.stopSchedule

import java.time.LocalDateTime

data class StopSchedulesResponse (
        val expirationDate: LocalDateTime,
        val departures: Departures
)
