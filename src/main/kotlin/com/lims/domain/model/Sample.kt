package com.lims.domain.model

import java.util.*

class Sample(
    var id: Long,
    var type: SampleType,
    var productionDate: Date,
    var receptionDate: Date,
    var expirationDate: Date,
    var measureValue: Double,
    var employeeResultInterpretation: String,
    var adminResultInterpretation: String,
    var lotNumber: Int,
    var progress: Double,
    var confirmed: Boolean,
    var conform: Boolean,
    var cost: Double,
    var minTimeFrame: Int,
    var maxTimeFrame: Int,
    var unit: Unit,
    var container: SampleContainer,
) {
    fun toInfra(): com.lims.infrastructure.model.Sample = com.lims.infrastructure.model.Sample(
        id,
        type.toInfra(),
        productionDate,
        receptionDate,
        expirationDate,
        measureValue,
        employeeResultInterpretation,
        adminResultInterpretation,
        lotNumber,
        progress,
        confirmed,
        conform,
        cost,
        minTimeFrame,
        maxTimeFrame,
        unit.toInfra(),
        container.toInfra()
    )

    fun toApi(): com.lims.api.model.Sample =  com.lims.api.model.Sample(
        id,
        type.toApi(),
        productionDate,
        receptionDate,
        expirationDate,
        measureValue,
        employeeResultInterpretation,
        adminResultInterpretation,
        lotNumber,
        progress,
        confirmed,
        conform,
        cost,
        minTimeFrame,
        maxTimeFrame,
        unit.toApi(),
        container.toApi()
    )

}
