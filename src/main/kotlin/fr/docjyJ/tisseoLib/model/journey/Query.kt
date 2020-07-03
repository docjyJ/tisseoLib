package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("maxSolutions")
    val maxSolutions: Int,
    @SerializedName("places")
    val places: Places,
    @SerializedName("roadMode")
    val roadMode: String,
    @SerializedName("timeBounds")
    val timeBounds: TimeBounds
)
