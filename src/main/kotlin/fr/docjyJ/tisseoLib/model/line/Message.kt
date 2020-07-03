package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("content")
    val content: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("importanceLevel")
    val importanceLevel: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)
