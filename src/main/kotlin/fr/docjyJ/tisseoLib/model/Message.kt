package fr.docjyJ.tisseoLib.model

data class Message (
    val content:String,
    val id:String,
    val importanceLevel:String,
    val scope:String,
    val title:String,
    val type:String,
    val url:String
)
