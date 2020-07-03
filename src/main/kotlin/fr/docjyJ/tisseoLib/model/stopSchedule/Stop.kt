package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName

data class Stop(
    @SerializedName("handicappedCompliance")
    val handicappedCompliance: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("operatorCode")
    val operatorCode: String
)
