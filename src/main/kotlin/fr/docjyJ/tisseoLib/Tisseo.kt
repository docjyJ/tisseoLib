package fr.docjyJ.tisseoLib

import fr.docjyJ.tisseoLib.request.NetworksRequest
import fr.docjyJ.tisseoLib.request.StopAreaRequest
import fr.docjyJ.tisseoLib.request.StopPointRequest

class Tisseo(private val apiKey : String) {
    fun stopArea(): StopAreaRequest {
        return StopAreaRequest(apiKey)
    }
    fun stopPoint(): StopPointRequest {
        return StopPointRequest(apiKey)
    }

    //TODO PLACES

    fun networks(): NetworksRequest {
        return NetworksRequest(apiKey)
    }

    //TODO LINES

    //TODO STOPS_SCHEDULES

    //TODO ROLLING_STOCKS

    //TODO JOURNEYS

    //TODO MESSAGES

    //TODO SERVICE_DENSITY

}
