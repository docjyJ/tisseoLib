package fr.docjyJ.tisseoLib.model

data class Line(
    val bgXmlColor:String,
    val color:String,
    val fgXmlColor:String,
    val geometry:List<Geometry>?,
    val id:String,
    val name:String,
    val network:String,
    val reservationMandatory:Boolean,
    val shortName:String,
    val terminus:List<Terminus>?,
    val transportMode:TransportMode
)
