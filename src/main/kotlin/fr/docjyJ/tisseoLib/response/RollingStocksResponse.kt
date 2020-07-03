package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.rollingStock.RollingStock
import java.time.LocalDateTime

data class RollingStocksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("rollingStocks")
    val rollingStocks: List<RollingStock>
)
