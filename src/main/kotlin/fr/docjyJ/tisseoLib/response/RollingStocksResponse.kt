package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.rollingStock.RollingStock
import java.time.LocalDateTime

/**
 * The response class of a rolling stocks request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class RollingStocksResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("rollingStocks")
    val rollingStocks: List<RollingStock>
) : TisseoResponse
