package fr.docjyJ.tisseoLib.model.serviceDensity

data class StopsService (
    val dataSource: String,
    val distance: Long,
    val id: String,
    val name: String,
    val services: List<Services>
)
