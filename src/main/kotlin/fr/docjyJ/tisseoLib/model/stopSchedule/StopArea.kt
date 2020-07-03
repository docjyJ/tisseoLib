package fr.docjyJ.tisseoLib.model.stopSchedule


import com.google.gson.annotations.SerializedName

data class StopArea(
    @SerializedName("cityId")
    val cityId: String,
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("schedules")
    val schedules: List<Schedule>,
    @SerializedName("uniqueStopId")
    val uniqueStopId: String
)
