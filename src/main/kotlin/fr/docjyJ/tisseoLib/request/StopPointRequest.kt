package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.StopPointResponce
import fr.docjyJ.tisseoLib.utils.TisseoException


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

    var number:Int? = null
        private set
    fun setNumber(number: Int) = apply { this.number = number }

    var sortByDistance:Boolean? = null
        private set
    fun setSortByDistance(sortByDistance: Boolean) = apply { this.sortByDistance = sortByDistance }

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
        addParameter("network",network)
        addParameter("srid",srid)
        addParameter("bbox",bbox)
        addParameter("number", number)
        addParameter("displayDestinations",displayDestinations)
        addParameter("sortByDistance",sortByDistance)
        addParameter("displayLines",displayLines)
        addParameter("displayCoordXY",displayCoordXY)
        addParameter("lineId",lineId)
        addParameter("stopAreaId",stopAreaId)
        addParameter("timeframe",timeframe)
        addParameter("displayStopsWithoutDeparture",displayStopsWithoutDeparture)
        return getRequest(StopPointResponce::class.java)
    }


}
