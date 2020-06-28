package fr.docjyJ.tisseoLib.model

data class Destination (
        val cityName:String,
        val id:String,
        val line:List<Line>?,
        val name:String
)
