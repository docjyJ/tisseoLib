package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.RollingStocksResponse

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 */

class RollingStocksRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<RollingStocksResponse>(
        "rolling_stocks",
        RollingStocksResponse::class.java
)
