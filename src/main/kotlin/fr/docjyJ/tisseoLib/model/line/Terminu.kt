package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName

data class Terminu(
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)
