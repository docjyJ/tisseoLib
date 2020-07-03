package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class TimeBounds(
    @SerializedName("maxDepartureHour")
    val maxDepartureHour: LocalDateTime,
    @SerializedName("minArrivalHour")
    val minArrivalHour: LocalDateTime
)
