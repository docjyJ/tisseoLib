package fr.docjyJ.tisseoLib.model.stopArea


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line
import fr.docjyJ.tisseoLib.model.stopPoint.PhysicalStop

data class StopArea(
    @SerializedName("cityId")
    val cityId: String,
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("line")
    val line: List<Line>,
    @SerializedName("name")
    val name: String,
    @SerializedName("stops")
    val stops: List<PhysicalStop>,
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)
