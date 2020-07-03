package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName
import java.time.LocalTime

data class Stop(
    @SerializedName("arrival_id")
    val arrivalId: String,
    @SerializedName("connectionPlace")
    val connectionPlace: ConnectionPlace,
    @SerializedName("departure_id")
    val departureId: String,
    @SerializedName("firstTime")
    val firstTime: LocalTime,
    @SerializedName("lastTime")
    val lastTime: LocalTime,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("text")
    val text: Text
)
