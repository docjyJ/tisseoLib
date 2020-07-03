package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopPoint.PhysicalStops
import java.time.LocalDateTime

data class StopPointResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("physicalStops")
    val physicalStops: PhysicalStops
)
