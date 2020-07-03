package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName

data class TransportMode(
    @SerializedName("article")
    val article: String,
    @SerializedName("id")

    val id: String,
    @SerializedName("name")
    val name: String
)
