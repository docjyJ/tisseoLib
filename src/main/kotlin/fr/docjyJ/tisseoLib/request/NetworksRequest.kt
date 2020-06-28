package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.NetworksResponse
import fr.docjyJ.tisseoLib.utils.TisseoException


class NetworksRequest internal constructor(apiKey: String) : Request(apiKey,"networks"){

    @Throws(TisseoException::class)
    fun execute(): NetworksResponse? {
        return getRequest(NetworksResponse::class.java)
    }

}
