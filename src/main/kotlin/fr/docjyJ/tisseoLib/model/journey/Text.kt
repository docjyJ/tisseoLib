package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class Text(
    @SerializedName("lang")
    val lang: String,
    @SerializedName("text")
    val text: String
)
