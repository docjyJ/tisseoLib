package fr.docjyJ.tisseoLib.model.stopPoint


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopArea.StopArea
import fr.docjyJ.tisseoLib.model.stopSchedule.Destination

data class PhysicalStop(
    @SerializedName("destinations")
    val destinations: List<Destination>,
    @SerializedName("handicappedCompliance")
    val handicappedCompliance: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("lines")
    val lines: List<LineX>,
    @SerializedName("name")
    val name: String,
    @SerializedName("operatorCodes")
    val operatorCodes: List<OperatorCode>,
    @SerializedName("stopArea")
    val stopArea: StopArea,
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)
