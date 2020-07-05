package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryName
import fr.docjyJ.tisseoLib.response.LinesResponse

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

class LinesRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<LinesResponse>(
        "lines",
        LinesResponse::class.java
) {
    @QueryName("network")
    var network:String? = null
    @QueryName("lineId")
    var lineId:String? = null
    @QueryName("shortName")
    var shortName:String? = null
    @QueryName("displayTerminus")
    var displayTerminus:Boolean? = null
    @QueryName("displayMessages")
    var displayMessages:Boolean? = null
    @QueryName("displayOnlyDisrupted")
    var displayOnlyDisrupted:Boolean? = null
    @QueryName("displayGeometry")
    var displayGeometry:Boolean? = null
    @QueryName("contentFormat")
    var contentFormat:String? = null
}
