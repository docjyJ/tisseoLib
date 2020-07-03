package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.message.MessageX
import java.awt.Color

data class Line(
        @SerializedName("bgXmlColor")
    val bgXmlColor: Color,
        @SerializedName("color")
    val color: String,
        @SerializedName("fgXmlColor")
    val fgXmlColor: Color,
        @SerializedName("geometry")
    val geometry: List<GeometryX>,
        @SerializedName("id")
    val id: String,
        @SerializedName("messages")
    val messages: List<MessageX>,
        @SerializedName("name")
    val name: String,
        @SerializedName("network")
    val network: String,
        @SerializedName("reservationMandatory")
    val reservationMandatory: Boolean,
        @SerializedName("shortName")
    val shortName: String,
        @SerializedName("terminus")
    val terminus: List<Terminu>,
        @SerializedName("transportMode")
    val transportMode: TransportMode,
        @SerializedName("service_number")
    val serviceNumber: String,
        @SerializedName("style")
    val style: String
)
