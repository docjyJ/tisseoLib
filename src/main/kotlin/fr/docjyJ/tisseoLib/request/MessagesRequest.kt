package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.MessagesResponse

/**
 * The class builder to do a Message request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 * @property network Transport operator.
 * @property contentFormat Format message contents.
 * @property displayImportantOnly Displays only important messages. (found on the home page tisseo)
 */

class MessagesRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<MessagesResponse>(
        "messages",
        MessagesResponse::class.java
) {
    @QueryName("network")
    var network:String? = null
    @QueryName("contentFormat")
    var contentFormat:String? = null
    @QueryName("displayImportantOnly")
    var displayImportantOnly:Boolean? = null
}
