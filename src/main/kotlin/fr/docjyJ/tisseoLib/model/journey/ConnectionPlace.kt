package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class ConnectionPlace(
    @SerializedName("city")
    val city: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)
