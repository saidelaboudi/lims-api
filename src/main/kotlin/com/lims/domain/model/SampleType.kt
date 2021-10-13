package com.lims.domain.model

class SampleType(
    var id: Long,
    var name: String,
    var description: String,
    var minVolume: Double,
    var measurement: Double,
    var stabilityInfo: String,
    var unit: Unit,
) {
    fun toInfra(): com.lims.infrastructure.model.SampleType = com.lims.infrastructure.model.SampleType(
        id, name, description, minVolume, measurement, stabilityInfo, unit.toInfra()
    )

    fun toApi(): com.lims.api.model.SampleType =com.lims.api.model.SampleType(id, name, description, minVolume, measurement, stabilityInfo, unit.toApi())
    fun toDomain(): com.lims.domain.model.SampleType = com.lims.domain.model.SampleType (id, name, description, minVolume, measurement, stabilityInfo, unit.toDomain())

}
