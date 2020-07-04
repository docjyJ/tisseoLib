package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.connection.RequestTemplate
import fr.docjyJ.apiClientBuilder.exception.ClientException
import fr.docjyJ.apiClientBuilder.exception.ServerException
import fr.docjyJ.tisseoLib.response.RollingStocksResponse

/**
 * The class builder to do a Rolling Stocks request.
 *
 * @constructor Create new request builder with no parameters.
 */

class RollingStocksRequest(private val apiKey: String) : RequestTemplate {

    private fun buildParams() = RequestBuilder(apiKey, "rolling_stocks")

    /**
     * Execute the request.
     * @return Response of request in RollingStocksResponse object.
     * @throws ServerException When the server returns an error.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ServerException::class, ClientException::class)
    override fun execute() = buildParams().execute(RollingStocksResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws ServerException When the server returns an error.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ServerException::class, ClientException::class)
    override fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ClientException::class)
    override fun getUrl() = buildParams().getUrl()

}
