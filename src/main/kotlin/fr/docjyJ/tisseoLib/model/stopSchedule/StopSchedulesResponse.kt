package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class StopSchedulesResponse(
    @SerializedName("departures")
    val departures: Departures,
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime
)
