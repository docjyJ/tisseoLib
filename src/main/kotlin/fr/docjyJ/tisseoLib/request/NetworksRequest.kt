package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.exception.TisseoServerException
import fr.docjyJ.tisseoLib.response.NetworksResponse

/**
 * The class builder to do a Network request.
 *
 * @constructor Create new request builder with no parameters.
 */

class NetworksRequest(private val apiKey: String) : TisseoRequest {
    private fun buildParams() = RequestBuilder(apiKey, "networks")

    /**
     * Execute the request.
     * @return Response of request in NetworksResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    override fun execute() = buildParams().execute(NetworksResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    override fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    override fun getUrl() = buildParams().getUrl()

}
