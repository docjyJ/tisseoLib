package fr.docjyJ.tisseoLib.model.serviceDensity


import com.google.gson.annotations.SerializedName
import java.time.LocalTime

data class ServiceX(
    @SerializedName("departure")
    val departure: LocalTime,
    @SerializedName("id")
    val id: Long,
    @SerializedName("JourneyName")
    val journeyName: String,
    @SerializedName("LineName")
    val lineName: String,
    @SerializedName("network")
    val network: String,
    @SerializedName("rollingStock")
    val rollingStock: String
)
