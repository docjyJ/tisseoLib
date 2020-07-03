package fr.docjyJ.tisseoLib.model.netwotk


import com.google.gson.annotations.SerializedName

data class Network(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)
