package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line

data class DestinationStop(
    @SerializedName("line")
    val line: Line,
    @SerializedName("name")
    val name: String
)
