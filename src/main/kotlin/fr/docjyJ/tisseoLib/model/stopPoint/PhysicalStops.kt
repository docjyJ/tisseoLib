package fr.docjyJ.tisseoLib.model.stopPoint


import com.google.gson.annotations.SerializedName

data class PhysicalStops(
    @SerializedName("physicalStop")
    val physicalStop: List<PhysicalStop>
)
