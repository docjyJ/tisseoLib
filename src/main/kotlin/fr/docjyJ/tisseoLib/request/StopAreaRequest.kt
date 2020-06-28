package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.StopAreaResponse
import fr.docjyJ.tisseoLib.utils.TisseoException


class StopAreaRequest internal constructor(apiKey: String) : Request(apiKey,"stop_areas") {

    var network:String? = null
        private set
    fun setNetwork(network: String) = apply { this.network = network }

    var srid:String? = null
        private set
    fun setSrid(srid: String) = apply { this.srid = srid }

    var bbox:String? = null
        private set
    fun setBbox(bbox: String) = apply { this.bbox = bbox }

    var displayLines:Boolean? = null
        private set
    fun setDisplayLines(displayLines: Boolean) = apply { this.displayLines = displayLines }

    var displayCoordXY:Boolean? = null
        private set
    fun setDisplayCoordXY(displayCoordXY: Boolean) = apply { this.displayCoordXY = displayCoordXY }

    var lineId:String? = null
        private set
    fun setLineId(lineId: String) = apply { this.lineId = lineId }

    var terminusId:String? = null
        private set
    fun setTerminusId(terminusId: String) = apply { this.terminusId = terminusId }

    var timeframe:String? = null
        private set
    fun setTimeframe(timeframe: String) = apply { this.timeframe = timeframe }

    var ignoreUnservedStops:String? = null
        private set
    fun setIgnoreUnservedStops(ignoreUnservedStops: String) = apply { this.ignoreUnservedStops = ignoreUnservedStops }

    var displayArrivalOnlyLines:Boolean? = null
        private set
    fun setDisplayArrivalOnlyLines(displayArrivalOnlyLines: Boolean) = apply { this.displayArrivalOnlyLines = displayArrivalOnlyLines }

    var displayStopPoints:Boolean? = null
        private set
    fun setDisplayStopPoints(displayStopPoints: Boolean) = apply { this.displayStopPoints = displayStopPoints }


    @Throws(TisseoException::class)
    fun execute(): StopAreaResponse? {
        addParameter("network",network)
        addParameter("srid",srid)
        addParameter("bbox",bbox)
        addParameter("displayLines",displayLines)
        addParameter("displayCoordXY",displayCoordXY)
        addParameter("lineId",lineId)
        addParameter("terminusId",terminusId)
        addParameter("timeframe",timeframe)
        addParameter("ignoreUnservedStops",ignoreUnservedStops)
        addParameter("displayArrivalOnlyLines",displayArrivalOnlyLines)
        addParameter("displayStopPoints",displayStopPoints)
        return getRequest(StopAreaResponse::class.java)
    }

}
