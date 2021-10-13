package com.lims.domain.model

import java.util.ArrayList

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

    fun toInfra(): com.lims.infrastructure.model.Test =
        com.lims.infrastructure.model.Test(id, name, description, available, price,
            samples.map { it.toInfra() } as ArrayList<com.lims.infrastructure.model.Sample>)

    fun toApi(): com.lims.api.model.Test = com.lims.api.model.Test(id, name, description, available, price,
        samples.map { it.toApi() } as ArrayList<com.lims.api.model.Sample>)
}
