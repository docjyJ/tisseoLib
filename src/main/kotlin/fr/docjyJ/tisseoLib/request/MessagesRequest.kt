@file:Suppress("MemberVisibilityCanBePrivate")

package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.exception.TisseoServerException
import fr.docjyJ.tisseoLib.response.MessagesResponse

/**
 * The class builder to do a Message request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property network Transport operator.
 * @property contentFormat Format message contents.
 * @property displayImportantOnly Displays only important messages. (found on the home page tisseo)
 */

class MessagesRequest(private val apiKey: String) : TisseoRequest {
    var network:String? = null
    var contentFormat:String? = null
    var displayImportantOnly:Boolean? = null

    private fun buildParams() = RequestBuilder(apiKey, "messages").apply {
        addParameter("network",network)
        addParameter("contentFormat",contentFormat)
        addParameter("displayImportantOnly",displayImportantOnly)
    }

    /**
     * Execute the request.
     * @return Response of request in MessagesResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    override fun execute() = buildParams().execute(MessagesResponse::class.java)

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
