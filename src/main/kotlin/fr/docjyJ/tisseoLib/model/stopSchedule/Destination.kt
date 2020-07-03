package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line

data class Destination(
    @SerializedName("cityId")
    val cityId: String,
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("line")
    val line: List<Line>,
    @SerializedName("name")
    val name: String
)
