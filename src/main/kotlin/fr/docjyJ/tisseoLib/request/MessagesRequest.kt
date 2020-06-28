package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.LinesResponse
import fr.docjyJ.tisseoLib.model.MessagesResponse
import fr.docjyJ.tisseoLib.utils.TisseoException


class MessagesRequest internal constructor(apiKey: String) : Request(apiKey,"messages"){

    var network:String? = null
        private set
    fun setNetwork(network: String) = apply { this.network = network }

    var contentFormat:String? = null
        private set
    fun setContentFormat(contentFormat: String) = apply { this.contentFormat = contentFormat }

    var displayImportantOnly:Boolean? = null
        private set
    fun setDisplayImportantOnly(displayImportantOnly: Boolean) = apply { this.displayImportantOnly = displayImportantOnly }


    @Throws(TisseoException::class)
    fun execute(): MessagesResponse {
        addParameter("network",network)
        addParameter("contentFormat",contentFormat)
        addParameter("displayImportantOnly",displayImportantOnly)
        return getRequest(MessagesResponse::class.java)

    }

}
