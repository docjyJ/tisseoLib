package fr.docjyJ.tisseoLib.data

data class StopPoints(
    val handicappedCompliance:String,
    val id:String,
    val lines:List<Lines>,
    val name:String,
    val operatorCodes:List<OperatorCodes>,
    val x:Double,
    val y:Double
)
