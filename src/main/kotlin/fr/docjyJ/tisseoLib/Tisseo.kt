package fr.docjyJ.tisseoLib

import fr.docjyJ.tisseoLib.request.*

class Tisseo(private val apiKey : String) {
    fun stopArea() = StopAreaRequest(apiKey)

    fun stopPoint() = StopPointRequest(apiKey)

    //TODO PLACES

    fun networks() = NetworksRequest(apiKey)

    fun lines() = LinesRequest(apiKey)

    //TODO STOPS_SCHEDULES

    //TODO ROLLING_STOCKS

    //TODO JOURNEYS

    fun messages() = MessagesRequest(apiKey)

    //TODO SERVICE_DENSITY

}
