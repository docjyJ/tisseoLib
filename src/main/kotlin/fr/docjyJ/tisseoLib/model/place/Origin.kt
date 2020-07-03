package fr.docjyJ.tisseoLib.model.place


import com.google.gson.annotations.SerializedName

data class Origin(
    @SerializedName("srid")
    val srid: Int,
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)
