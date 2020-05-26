package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.data.StopPointResponce
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.io.BufferedReader
import java.io.InputStreamReader


class StopPointRequest internal constructor(apiKey: String) : Request(apiKey,"stop_points"){

    var network:String? = null
        private set
    fun setNetwork(network: String) = apply { this.network = network }

    var srid:String? = null
        private set
    fun setSrid(srid: String) = apply { this.srid = srid }

    var bbox:String? = null
        private set
    fun setBbox(bbox: String) = apply { this.bbox = bbox }

    var sortByDistance:Boolean? = null
        private set
    fun setSortByDistance(sortByDistance: Boolean) = apply { this.sortByDistance = sortByDistance }

    var number:Int? = null
        private set
    fun setNumber(number: Int) = apply { this.number = number }

    var displayDestinations:Boolean? = null
        private set
    fun setDisplayDestinations(displayDestinations: Boolean) = apply { this.displayDestinations = displayDestinations }

    var displayLines:Boolean? = null
        private set
    fun setDisplayLines(displayLines: Boolean) = apply { this.displayLines = displayLines }

    var displayCoordXY:Boolean? = null
        private set
    fun setDisplayCoordXY(displayCoordXY: Boolean) = apply { this.displayCoordXY = displayCoordXY }

    var lineId:String? = null
        private set
    fun setLineId(lineId: String) = apply { this.lineId = lineId }

    var stopAreaId:String? = null
        private set
    fun setStopAreaId(stopAreaId: String) = apply { this.stopAreaId = stopAreaId }

    var timeframe:String? = null
        private set
    fun setTimeframe(timeframe: String) = apply { this.timeframe = timeframe }

    var displayStopsWithoutDeparture:Boolean? = null
        private set
    fun setDisplayStopsWithoutDeparture(displayStopsWithoutDeparture: Boolean) = apply { this.displayStopsWithoutDeparture = displayStopsWithoutDeparture }


    @Throws(TisseoException::class)
    fun execute(): StopPointResponce? {
        val sb = StringBuilder()
        sb.append(parameterBuilder("network",network))
        sb.append(parameterBuilder("srid",srid))
        sb.append(parameterBuilder("bbox",bbox))
        sb.append(parameterBuilder("sortByDistance",sortByDistance))
        sb.append(parameterBuilder("number", number))
        sb.append(parameterBuilder("displayLines",displayLines))
        sb.append(parameterBuilder("displayDestinations",displayDestinations))
        sb.append(parameterBuilder("displayCoordXY",displayCoordXY))
        sb.append(parameterBuilder("lineId",lineId))
        sb.append(parameterBuilder("stopAreaId",stopAreaId))
        sb.append(parameterBuilder("timeframe",timeframe))
        sb.append(parameterBuilder("displayStopsWithoutDeparture",displayStopsWithoutDeparture))
        return GSON.fromJson(getRequest(sb.toString()), StopPointResponce::class.java)

        /*
        //Get Response
        val rd = BufferedReader(getRequest(sb.toString()))
        val response = StringBuffer()

        var line: String?
        while (rd.readLine().also { line = it } != null) {
            response.append(line)
            response.append('\n')
        }
        rd.close()
        println(response.toString())
         */
    }

}
