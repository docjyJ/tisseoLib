package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line

data class Departure(
    @SerializedName("dateTime")
    val dateTime: String,
    @SerializedName("destination")
    val destination: List<Destination>,
    @SerializedName("line")
    val line: Line,
    @SerializedName("realTime")
    val realTime: Boolean
)
