package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
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
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<LinesResponse>(LinesResponse::class.java) {
    @EndpointURL
    private val endpointURL = "https://api.tisseo.fr/v1/lines.json"

    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("lineId")
    var lineId:String? = null
    @QueryParameter("shortName")
    var shortName:String? = null
    @QueryParameter("displayTerminus")
    var displayTerminus:Boolean? = null
    @QueryParameter("displayMessages")
    var displayMessages:Boolean? = null
    @QueryParameter("displayOnlyDisrupted")
    var displayOnlyDisrupted:Boolean? = null
    @QueryParameter("displayGeometry")
    var displayGeometry:Boolean? = null
    @QueryParameter("contentFormat")
    var contentFormat:String? = null
}
