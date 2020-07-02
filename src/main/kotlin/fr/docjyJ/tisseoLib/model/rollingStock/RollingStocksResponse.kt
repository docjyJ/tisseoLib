package fr.docjyJ.tisseoLib.model.rollingStock

import java.time.LocalDateTime

data class RollingStocksResponse (
    val expirationDate: LocalDateTime,
    val rollingStocks: List<RollingStock>
)
