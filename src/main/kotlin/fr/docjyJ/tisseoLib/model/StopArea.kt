package fr.docjyJ.tisseoLib.model

data class StopArea(
        val cityName:String,
        val id:String,
        val line:List<Line>?,
        val name:String,
        val stops:List<StopPoint>?,
        val x:Double?,
        val y:Double?
)
