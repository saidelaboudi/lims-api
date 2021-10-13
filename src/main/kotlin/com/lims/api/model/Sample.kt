package com.lims.api.model

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
    var confirme: Boolean,
    var conform: Boolean,
    var cost: Double,
    var minTimeFrame: Int,
    var maxTimeFrame: Int,
    var unit: Unit,
    var container: SampleContainer,
) {
    fun toDomain(): com.lims.domain.model.Sample = com.lims.domain.model.Sample(
        id,
        type.toDomain(),
        productionDate,
        receptionDate,
        expirationDate,
        measureValue,
        employeeResultInterpretation,
        adminResultInterpretation,
        lotNumber,
        progress,
        confirme,
        conform,
        cost,
        minTimeFrame,
        maxTimeFrame,
        unit.toDomain(),
        container.toDomain()
    )

}
