package fr.docjyJ.tisseoLib.model

data class Schedule(
        val destination: StopPoint,
        val journeys: List<JourneysShudle>,
        val line: Line,
        val stop: StopPoint

)
