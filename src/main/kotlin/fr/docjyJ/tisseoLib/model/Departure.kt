package fr.docjyJ.tisseoLib.model

data class Departure(
    val dateTime:String,
    val destination:List<StopPoint>,
    val line:Line,
    val realTime:String
)
