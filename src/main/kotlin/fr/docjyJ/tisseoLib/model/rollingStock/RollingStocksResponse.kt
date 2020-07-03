package fr.docjyJ.tisseoLib.model.rollingStock


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class RollingStocksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("rollingStocks")
    val rollingStocks: List<RollingStock>
)
