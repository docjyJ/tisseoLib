package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName
import org.locationtech.jts.geom.Geometry
import java.time.Duration
import java.time.LocalTime

data class Service(
    @SerializedName("destinationStop")
    val destinationStop: DestinationStop,
    @SerializedName("duration")
    val duration: Duration,
    @SerializedName("firstArrivalTime")
    val firstArrivalTime: LocalTime,
    @SerializedName("firstDepartureTime")
    val firstDepartureTime: LocalTime,
    @SerializedName("isContinuousService")
    val isContinuousService: Boolean,
    @SerializedName("lastArrivalTime")
    val lastArrivalTime: LocalTime,
    @SerializedName("lastDepartureTime")
    val lastDepartureTime: LocalTime,
    @SerializedName("maxWaitingTime")
    val maxWaitingTime: Duration,
    @SerializedName("name")
    val name: String,
    @SerializedName("text")
    val text: Text,
    @SerializedName("wkt")
    val wkt: Geometry
)
