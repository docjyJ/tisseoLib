package fr.docjyJ.tisseoLib.model

data class Query (
        val maxSolutions:Int,
        val places:JourneyPlace,
        val roadMode:String,
        val timeBounds:TimeBounds
)
