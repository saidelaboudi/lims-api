package com.lims.api.model

class SampleType(
    var id: Long,
    var name: String,
    var description: String,
    var minVolume: Double,
    var measurment: Double,
    var stabilityInfo: String,
    var unit: Unit,
) {
    fun toDomain(): com.lims.domain.model.SampleType = com.lims.domain.model.SampleType(
        id,
        name,
        description,
        minVolume,
        measurment,
        stabilityInfo,
        unit.toDomain()
    )

}
