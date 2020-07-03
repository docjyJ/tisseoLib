package fr.docjyJ.tisseoLib.model.place


import com.google.gson.annotations.SerializedName

data class Place(
    @SerializedName("address")
    val address: String?,
    @SerializedName("category")
    val category: String,
    @SerializedName("cityName")
    val cityName: String?,
    @SerializedName("className")
    val className: String,
    @SerializedName("distanceToOrigin")
    val distanceToOrigin: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("key")
    val key: String,
    @SerializedName("label")
    val label: String,
    @SerializedName("network")
    val network: String?,
    @SerializedName("postcode")
    val postcode: String?,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("type")
    val type: String?,
    @SerializedName("typeCompressed")
    val typeCompressed: String?,
    @SerializedName("veloStation")
    val veloStation: String?,
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)
