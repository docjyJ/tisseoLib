package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.line.LinesResponse
import fr.docjyJ.tisseoLib.model.rollingStock.RollingStocksResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 *
 */

@Suppress("MemberVisibilityCanBePrivate")
class RollingStocksRequest(private val apiKey: String) {

    private fun buildParams() = RequestBuilder(apiKey, "rolling_stocks")

    /**
     * Execute the request.
     * @return Response of request in RollingStocksResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(RollingStocksResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()

}
