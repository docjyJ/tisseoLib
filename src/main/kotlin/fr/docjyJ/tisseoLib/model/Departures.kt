package fr.docjyJ.tisseoLib.model

data class Departures(
    val stopAreas: List<StopArea>?,
    val departure: List<Departure>?,
    val stop: StopPoint?,
    val stopArea:StopArea?
)
