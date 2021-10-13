package com.lims.domain.model

class Unit(var id: Long, var name: String) {
    fun toInfra(): com.lims.infrastructure.model.Unit = com.lims.infrastructure.model.Unit(id, name)
    fun toApi(): com.lims.api.model.Unit = com.lims.api.model.Unit(id, name)
    fun toDomain(): com.lims.domain.model.Unit = com.lims.domain.model.Unit(id, name)
}
