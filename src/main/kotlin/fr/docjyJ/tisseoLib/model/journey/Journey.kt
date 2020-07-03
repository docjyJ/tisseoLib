package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class Journey(
    @SerializedName("journey")
    val journey: JourneyX
)
