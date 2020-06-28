package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.LinesResponse
import fr.docjyJ.tisseoLib.utils.TisseoException


class LinesRequest internal constructor(apiKey: String) : Request(apiKey,"lines"){

    var network:String? = null
        private set
    fun setNetwork(network: String) = apply { this.network = network }

    var lineId:String? = null
        private set
    fun setLineId(lineId: String) = apply { this.lineId = lineId }

    var shortName:String? = null
        private set
    fun setShortName(shortName: String) = apply { this.shortName = shortName }

    var displayTerminus:Boolean? = null
        private set
    fun setDisplayTerminus(displayTerminus: Boolean) = apply { this.displayTerminus = displayTerminus }

    var displayMessages:Boolean? = null
        private set
    fun setDisplayMessages(displayMessages: Boolean) = apply { this.displayMessages = displayMessages }

    var displayOnlyDisrupted:Boolean? = null
        private set
    fun setDisplayOnlyDisrupted(displayOnlyDisrupted: Boolean) = apply { this.displayOnlyDisrupted = displayOnlyDisrupted }

    var displayGeometry:Boolean? = null
        private set
    fun setDisplayGeometry(displayGeometry: Boolean) = apply { this.displayGeometry = displayGeometry }

    var contentFormat:String? = null
        private set
    fun setContentFormat(contentFormat: String) = apply { this.contentFormat = contentFormat }


    @Throws(TisseoException::class)
    fun execute(): LinesResponse? {
        addParameter("network",network)
        addParameter("lineId",lineId)
        addParameter("shortName",shortName)
        addParameter("displayTerminus",displayTerminus)
        addParameter("displayMessages",displayMessages)
        addParameter("displayOnlyDisrupted", displayOnlyDisrupted)
        addParameter("displayGeometry",displayGeometry)
        addParameter("contentFormat",contentFormat)
        return getRequest(LinesResponse::class.java)

    }

}
