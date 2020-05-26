package fr.docjyJ.tisseoLib.data

data class Line(
    val bgXmlColor:String,
    val color:String,
    val fgXmlColor:String,
    val id:String,
    val name:String,
    val network:String,
    val reservationMandatory:String,
    val shortName:String,
    val transportMode:TransportMode
)
