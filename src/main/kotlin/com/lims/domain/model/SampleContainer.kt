package com.lims.domain.model

class SampleContainer(var id: Long, var name: String, var description: String) {
    fun toInfra(): com.lims.infrastructure.model.SampleContainer = com.lims.infrastructure.model.SampleContainer(id, name, description)
    fun toApi(): com.lims.api.model.SampleContainer = com.lims.api.model.SampleContainer(id, name, description)
}
