package fr.docjyJ.tisseoLib.model.message


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.line.Line

data class Message(
        @SerializedName("lines")
    val lines: List<Line>,
        @SerializedName("message")
    val message: MessageX
)
