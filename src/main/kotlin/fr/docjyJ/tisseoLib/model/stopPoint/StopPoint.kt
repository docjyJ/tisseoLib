package fr.docjyJ.tisseoLib.model.stopPoint

import fr.docjyJ.tisseoLib.model.line.Line
import fr.docjyJ.tisseoLib.model.stopArea.StopArea

data class StopPoint (
        val destinations: List<StopPoint>?,
        val handicappedCompliance: Boolean?,
        val id: String,
        val lines: List<LineShort>?,
        val name: String,
        val operatorCodes: List<OperatorCodes>?,
        val operatorCode: String?,
        val stopArea: StopArea?,
        val x: Double?,
        val y: Double?,
        val cityName: String?,
        val line: List<Line>?,
        val cityId: String?
)
