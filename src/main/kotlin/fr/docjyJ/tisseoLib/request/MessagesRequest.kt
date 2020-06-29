package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.MessagesResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Message request.
 *
 * @property network The network propriety.
 * @property contentFormat The contentFormat propriety.
 * @property displayImportantOnly The displayImportantOnly propriety.
 */

@Suppress("MemberVisibilityCanBePrivate")
class MessagesRequest(private val apiKey: String){
    var network:String? = null
    var contentFormat:String? = null
    var displayImportantOnly:Boolean? = null

    /**
     * Execute the request.
     * @return Response of request in MessagesResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = RequestBuilder()
        .apply {
            addParameter("network",network)
            addParameter("contentFormat",contentFormat)
            addParameter("displayImportantOnly",displayImportantOnly)
        }
        .execute(apiKey,"messages", MessagesResponse::class.java)
}
