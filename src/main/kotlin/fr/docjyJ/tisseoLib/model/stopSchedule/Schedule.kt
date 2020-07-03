package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line

data class Schedule(
    @SerializedName("destination")
    val destination: Destination,
    @SerializedName("journeys")
    val journeys: List<Journey>,
    @SerializedName("line")
    val line: Line,
    @SerializedName("stop")
    val stop: Stop
)
