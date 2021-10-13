package com.lims.infrastructure.model

import com.lims.domain.model.SampleType
import javax.persistence.*

@Entity
@Table
class SampleType(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var minVolume: Double? = null,
    var measurment: Double? = null,
    var stabilityInfo: String? = null,
    @ManyToOne(cascade = [CascadeType.ALL])
    var unit: Unit? = null,
) {
    fun toDomain(): com.lims.domain.model.SampleType =
        com.lims.domain.model.SampleType(
            id!!,
            name!!,
            description!!,
            minVolume!!,
            measurment!!,
            stabilityInfo!!,
            unit!!.toDomain()
        )
}
