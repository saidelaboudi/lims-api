package com.lims.infrastructure.model

import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
@Table
class Test(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var available: Boolean? = null,
    var price: Double? = null,
    @OneToMany(cascade = [CascadeType.ALL])
    var samples: Collection<Sample> = ArrayList<Sample>(),
) {
    fun addSample(sample: Sample) {
        (samples.toList() as ArrayList<Sample>).add(sample)
    }

    fun toDomain(): com.lims.domain.model.Test = com.lims.domain.model.Test(
        id!!,
        name!!,
        description!!,
        available!!,
        price!!,
        samples!!.map { it.toDomain() } as java.util.ArrayList<com.lims.domain.model.Sample>
    )

}
