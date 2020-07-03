package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName

data class Departures(
    @SerializedName("stopAreas")
    val stopAreas: List<StopArea>,
    @SerializedName("departure")
    val departure: List<Departure>,
    @SerializedName("stop")
    val stop: Stop,
    @SerializedName("stopArea")
    val stopArea: StopArea
)
