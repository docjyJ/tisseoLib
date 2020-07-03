package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName
import java.time.Duration
import java.time.LocalDateTime

data class Journey(
    @SerializedName("dateTime")
    val dateTime: LocalDateTime,
    @SerializedName("realTime")
    val realTime: Boolean,
    @SerializedName("waiting_time")
    val waitingTime: Duration
)
