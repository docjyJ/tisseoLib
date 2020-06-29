package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.LinesResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Line request.
 *
 * @property network The network propriety.
 * @property lineId The lineId propriety.
 * @property shortName The shortName propriety.
 * @property displayTerminus The displayTerminus propriety.
 * @property displayMessages The displayMessages propriety.
 * @property displayOnlyDisrupted The displayOnlyDisrupted propriety.
 * @property displayGeometry The displayGeometry propriety.
 * @property contentFormat The contentFormat propriety.
 */

@Suppress("MemberVisibilityCanBePrivate")
class LinesRequest(private val apiKey: String) {
    var network:String? = null
    var lineId:String? = null
    var shortName:String? = null
    var displayTerminus:Boolean? = null
    var displayMessages:Boolean? = null
    var displayOnlyDisrupted:Boolean? = null
    var displayGeometry:Boolean? = null
    var contentFormat:String? = null

    /**
     * Execute the request.
     * @return Response of request in LinesResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = RequestBuilder()
        .apply {
            addParameter("network",network)
            addParameter("lineId",lineId)
            addParameter("shortName",shortName)
            addParameter("displayTerminus",displayTerminus)
            addParameter("displayMessages",displayMessages)
            addParameter("displayOnlyDisrupted", displayOnlyDisrupted)
            addParameter("displayGeometry",displayGeometry)
            addParameter("contentFormat",contentFormat)
        }
        .execute(apiKey, "lines", LinesResponse::class.java)
}
