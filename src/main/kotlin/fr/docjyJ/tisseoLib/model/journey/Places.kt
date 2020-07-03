package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class Places(
    @SerializedName("arrivalCity")
    val arrivalCity: String,
    @SerializedName("arrivalLatitude")
    val arrivalLatitude: Double,
    @SerializedName("arrivalLongitude")
    val arrivalLongitude: Double,
    @SerializedName("arrivalStop")
    val arrivalStop: String,
    @SerializedName("departureCity")
    val departureCity: String,
    @SerializedName("departureLatitude")
    val departureLatitude: Double,
    @SerializedName("departureLongitude")
    val departureLongitude: Double,
    @SerializedName("departureStop")
    val departureStop: String
)
