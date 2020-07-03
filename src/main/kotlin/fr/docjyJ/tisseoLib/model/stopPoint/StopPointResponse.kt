package fr.docjyJ.tisseoLib.model.stopPoint


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class StopPointResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("physicalStops")
    val physicalStops: PhysicalStops
)
