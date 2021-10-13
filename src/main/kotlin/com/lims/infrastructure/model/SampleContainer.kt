package com.lims.infrastructure.model

import javax.persistence.*

@Entity
@Table
class SampleContainer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?=null,
    var name: String?=null,
    var description: String?=null,
) {
    fun toDomain(): com.lims.domain.model.SampleContainer = com.lims.domain.model.SampleContainer(
        id!!,
        name!!,
        description!!
    )

}
