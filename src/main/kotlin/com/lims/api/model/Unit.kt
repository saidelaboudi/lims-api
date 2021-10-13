package com.lims.api.model

class Unit(val id: Long,val name: String) {
    fun toDomain(): com.lims.domain.model.Unit = com.lims.domain.model.Unit(id , name)

}
