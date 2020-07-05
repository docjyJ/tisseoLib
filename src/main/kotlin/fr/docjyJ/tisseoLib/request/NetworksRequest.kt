package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.NetworksResponse

/**
 * The class builder to do a Network request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 */

class NetworksRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<NetworksResponse>(
        "networks",
        NetworksResponse::class.java)
