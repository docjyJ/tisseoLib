package fr.docjyJ.tisseoLib.model.stopSchedule

import java.util.Date

data class StopSchedulesResponse (
    val expirationDate: Date,
    val departures: Departures
)
