package fr.docjyJ.tisseoLib.model.stopArea


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class StopAreaResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("stopAreas")
    val stopAreas: StopAreas
)
