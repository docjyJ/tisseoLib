package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopSchedule.Departures
import java.time.LocalDateTime

data class StopSchedulesResponse (
    @SerializedName("departures")
    val departures: Departures,
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime
) : TisseoResponse
