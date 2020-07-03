package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.model.rollingStock.RollingStocksResponse
import fr.docjyJ.tisseoLib.exception.TisseoServerException

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 */

@Suppress("MemberVisibilityCanBePrivate")
class RollingStocksRequest(private val apiKey: String) {

    private fun buildParams() = RequestBuilder(apiKey, "rolling_stocks")

    /**
     * Execute the request.
     * @return Response of request in RollingStocksResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun execute() = buildParams().execute(RollingStocksResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun executeAsString() = buildParams().execute()

}
