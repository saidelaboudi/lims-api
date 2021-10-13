package com.lims.api.model

import java.util.ArrayList
import kotlin.Unit

class Test(
    var id: Long,
    var name: String,
    var description: String,
    var available: Boolean,
    var price: Double,
    var samples: ArrayList<Sample>,
) {
    fun addSample(sample: Sample) {
        if (samples.isNullOrEmpty())
            samples = ArrayList<Sample>()
        samples.add(sample)
    }

    fun toDomain(): com.lims.domain.model.Test =com.lims.domain.model.Test(id, name, description, available, price, samples.map {it.toDomain()} as ArrayList<com.lims.domain.model.Sample>)

}
