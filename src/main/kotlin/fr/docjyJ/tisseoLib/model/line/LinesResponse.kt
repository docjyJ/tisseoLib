package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class LinesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("lines")
    val lines: Lines
)
