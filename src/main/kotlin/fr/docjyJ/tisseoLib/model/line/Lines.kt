package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName

data class Lines(
    @SerializedName("line")
    val line: List<Line>
)
