package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.serviceDensity.Stop
import java.time.LocalDateTime

data class ServiceDensityResponse(
    @SerializedName("distance")
    val distance: Int,
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("isServiceNumberReached")
    val isServiceNumberReached: Int,
    @SerializedName("serviceNumberReached")
    val serviceNumberReached: Int,
    @SerializedName("stops")
    val stops: List<Stop>
)
