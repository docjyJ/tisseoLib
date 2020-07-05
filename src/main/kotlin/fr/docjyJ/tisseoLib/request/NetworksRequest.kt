package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.NetworksResponse

/**
 * The class builder to do a Network request.
 *
 * @constructor Create new request builder with no parameters.
 */

class NetworksRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<NetworksResponse>(
        "networks",
        NetworksResponse::class.java)
