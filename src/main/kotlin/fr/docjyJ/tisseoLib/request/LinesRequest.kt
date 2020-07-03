package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.model.line.LinesResponse
import fr.docjyJ.tisseoLib.exception.TisseoServerException

/**
 * The class builder to do a Line request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property network Transport operator.
 * @property lineId Filter on a single line by its ID.
 * @property shortName Filter on a single line by line number.
 * @property displayTerminus Returns in extra logical stops terminus of each line.
 * @property displayMessages Geographic coordinates Returns in extra messages of line disturbance. (for the lines which are disturbed)
 * @property displayOnlyDisrupted Only returns lines with disturbance. (for the lines which are disturbed)
 * @property displayGeometry Return geometries in WKT. [see](http://fr.wikipedia.org/wiki/Well-known_text)
 * @property contentFormat Format of message content.
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

    private fun buildParams() = RequestBuilder(apiKey, "lines").apply {
        addParameter("network",network)
        addParameter("lineId",lineId)
        addParameter("shortName",shortName)
        addParameter("displayTerminus",displayTerminus)
        addParameter("displayMessages",displayMessages)
        addParameter("displayOnlyDisrupted", displayOnlyDisrupted)
        addParameter("displayGeometry",displayGeometry)
        addParameter("contentFormat",contentFormat)
    }

    /**
     * Execute the request.
     * @return Response of request in LinesResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class)
    fun execute() = buildParams().execute(LinesResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class)
    fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    fun getUrl() = buildParams().getUrl()

}
