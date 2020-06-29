package fr.docjyJ.tisseoLib.model

import javax.swing.LayoutStyle

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
    val terminus:List<StopPoint>?,
    val transportMode:TransportMode?,
    val style: String?
)
