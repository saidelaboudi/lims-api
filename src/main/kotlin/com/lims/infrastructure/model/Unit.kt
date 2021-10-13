package com.lims.infrastructure.model

import javax.persistence.*

@Entity
@Table
data class Unit(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,
) {
    fun toDomain(): com.lims.domain.model.Unit = com.lims.domain.model.Unit(id!!, name!!)
}
