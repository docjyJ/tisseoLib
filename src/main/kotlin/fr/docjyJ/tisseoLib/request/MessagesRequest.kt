package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
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

class MessagesRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<MessagesResponse>(MessagesResponse::class.java) {
    @EndpointURL
    private val endpointURL = "https://api.tisseo.fr/v1/messages.json"

    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("contentFormat")
    var contentFormat:String? = null
    @QueryParameter("displayImportantOnly")
    var displayImportantOnly:Boolean? = null
}
