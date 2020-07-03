package fr.docjyJ.tisseoLib.model.rollingStock


import com.google.gson.annotations.SerializedName

data class RollingStock(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)
