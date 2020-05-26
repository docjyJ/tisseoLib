package fr.docjyJ.tisseoLib.data

data class StopPoint(
    val destinations:List<Destination>?,
    val handicappedCompliance:Boolean,
    val id:String,
    val lines:List<Lines>?,
    val name:String,
    val operatorCodes:List<OperatorCodes>?,
    val stopArea:StopArea?,
    val x:Double?,
    val y:Double?
)
