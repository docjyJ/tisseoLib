package fr.docjyJ.tisseoLib.model

data class StopPoint(
        val destinations:List<Destination>?,
        val handicappedCompliance:Boolean,
        val id:String,
        val lines:List<LineShort>?,
        val name:String,
        val operatorCodes:List<OperatorCodes>?,
        val stopArea:StopArea?,
        val x:Double?,
        val y:Double?
)
