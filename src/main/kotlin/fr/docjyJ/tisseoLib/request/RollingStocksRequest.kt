package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryName
import fr.docjyJ.tisseoLib.response.RollingStocksResponse

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 */

class RollingStocksRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<RollingStocksResponse>(
        "rolling_stocks",
        RollingStocksResponse::class.java
)
