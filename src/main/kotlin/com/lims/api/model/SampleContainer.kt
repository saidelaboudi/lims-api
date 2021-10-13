package com.lims.api.model

class SampleContainer(var id: Long, var name: String, var description: String) {
    fun toDomain(): com.lims.domain.model.SampleContainer = com.lims.domain.model.SampleContainer(id, name, description)

}
