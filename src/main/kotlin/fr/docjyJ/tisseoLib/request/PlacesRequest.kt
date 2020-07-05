package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.PlacesResponse

/**
 * The class builder to do a Line request.
 *
 * Please note that the response object for the Place resource is not implemented.
 * It is possible to get the response string (via the executeAsString () method) and analyze it afterwards.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 * @property term Text string. (3 characters minimum)
 * @property network Transport operator.
 * @property coordinatesXY Returns nearest adresses from given x,y coordinates sorted by distance.
 * @property maxDistance Max search around distance.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property bbox Filters stops included in bounding box.
 * @property number Filters the results return max number by type of place.
 * @property displayBestPlace Returns the best result.
 * @property displayOnlyStopAreas Returns only object of className “stop”.
 * @property displayOnlyRoads Returns only object of className “road”.
 * @property displayOnlyAddresses Returns only object of className “address”.
 * @property displayOnlyPublicPlaces Returns only object of className “public_places”.
 * @property displayOnlyCities Returns only object of className “city”.
 * @property lang Choice of language.
 * @property simple Formatting the json output for jquery.
 * @property publicPlaceFilter List of public places to explose.
 */

class PlacesRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<PlacesResponse>(
        "places",
        PlacesResponse::class.java
) {
    @QueryName("term")
    var term:String? = null
    @QueryName("network")
    var network:String? = null
    @QueryName("coordinatesXY")
    var coordinatesXY:String? = null
    @QueryName("maxDistance")
    var maxDistance:Boolean? = null
    @QueryName("srid")
    var srid:String? = null
    @QueryName("bbox")
    var bbox:String? = null
    @QueryName("number")
    var number:Int? = null
    @QueryName("displayBestPlace")
    var displayBestPlace:Boolean? = null
    @QueryName("displayOnlyStopAreas")
    var displayOnlyStopAreas:Boolean? = null
    @QueryName("displayOnlyRoads")
    var displayOnlyRoads:Boolean? = null
    @QueryName("displayOnlyAddresses")
    var displayOnlyAddresses:Boolean? = null
    @QueryName("displayOnlyPublicPlaces")
    var displayOnlyPublicPlaces:Boolean? = null
    @QueryName("displayOnlyCities")
    var displayOnlyCities:Boolean? = null
    @QueryName("lang")
    var lang:String? = null
    @QueryName("simple")
    var simple:Boolean? = null
    @QueryName("publicPlaceFilter")
    var publicPlaceFilter:String? = null
}
