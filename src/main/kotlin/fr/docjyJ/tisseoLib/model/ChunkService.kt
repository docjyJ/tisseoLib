package fr.docjyJ.tisseoLib.model

data class ChunkService (
        val destinationStop: DestinationStop,
        val duration:String,
        val firstArrivalTime:String,
        val firstDepartureTime:String,
        val isContinuousService:Boolean,
        val lastArrivalTime:String,
        val lastDepartureTime:String,
        val maxWaitingTime:String,
        val name:String,
        val text:Text,
        val wkt:String
)
