package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.RollingStocksResponse

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 */

class RollingStocksRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<RollingStocksResponse>(
        "rolling_stocks",
        RollingStocksResponse::class.java
)
