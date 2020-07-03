package fr.docjyJ.tisseoLib.model.stopArea


import com.google.gson.annotations.SerializedName

data class StopAreas(
    @SerializedName("stopArea")
    val stopArea: List<StopArea>
)
