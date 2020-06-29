package fr.docjyJ.tisseoLib.model

data class Schedule(
    val destination: StopPoint,
    val journeys: List<Journeys>,
    val line: Line,
    val stop: StopPoint

)
