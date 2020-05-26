package fr.docjyJ.tisseoLib.data

data class Destination (
        val cityName:String,
        val id:String,
        val line:List<Line>?,
        val name:String
)
