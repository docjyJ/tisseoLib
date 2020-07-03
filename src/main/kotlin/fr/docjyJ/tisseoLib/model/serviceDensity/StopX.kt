package fr.docjyJ.tisseoLib.model.serviceDensity


import com.google.gson.annotations.SerializedName

data class StopX(
    @SerializedName("dataSource")
    val dataSource: String,
    @SerializedName("distance")
    val distance: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("services")
    val services: List<Service>
)
