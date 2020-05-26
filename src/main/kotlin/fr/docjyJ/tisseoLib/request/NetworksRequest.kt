package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.data.NetworksResponse
import fr.docjyJ.tisseoLib.data.StopPointResponce
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.io.BufferedReader
import java.io.InputStreamReader


class NetworksRequest internal constructor(apiKey: String) : Request(apiKey,"networks"){

    @Throws(TisseoException::class)
    fun execute(): NetworksResponse? {
        return GSON.fromJson(getRequest(null), NetworksResponse::class.java)
    }

}
