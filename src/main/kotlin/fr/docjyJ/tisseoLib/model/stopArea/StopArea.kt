package fr.docjyJ.tisseoLib.model.stopArea

import fr.docjyJ.tisseoLib.model.line.Line
import fr.docjyJ.tisseoLib.model.stopSchedule.Schedule
import fr.docjyJ.tisseoLib.model.stopPoint.StopPoint

data class StopArea (
        val cityName: String,
        val id: String,
        val line: List<Line>?,
        val name: String,
        val stops: List<StopPoint>?,
        val x: Double?,
        val y: Double?,
        val cityId: String?,
        val schedules: List<Schedule>?
)
