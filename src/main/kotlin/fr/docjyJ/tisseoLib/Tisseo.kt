package fr.docjyJ.tisseoLib

import fr.docjyJ.tisseoLib.request.*

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

    fun lines(): LinesRequest {
        return LinesRequest(apiKey)
    }

    //TODO STOPS_SCHEDULES

    //TODO ROLLING_STOCKS

    //TODO JOURNEYS

    //TODO MESSAGES

    //TODO SERVICE_DENSITY

}
