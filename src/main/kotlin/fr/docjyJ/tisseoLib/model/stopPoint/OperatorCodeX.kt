package fr.docjyJ.tisseoLib.model.stopPoint


import com.google.gson.annotations.SerializedName

data class OperatorCodeX(
    @SerializedName("network")
    val network: String,
    @SerializedName("value")
    val value: String
)
