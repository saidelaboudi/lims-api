package com.lims.infrastructure.model

import java.util.*
import javax.persistence.*

@Entity
@Table
class Sample(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @OneToOne(cascade = [CascadeType.PERSIST])
    var type: SampleType? = null,
    var productionDate: Date? = null,
    var receptionDate: Date? = null,
    var expirationDate: Date? = null,
    var measureValue: Double? = null,
    var employeeResultInterpretation: String? = null,
    var adminResultInterpretation: String? = null,
    var lotNumber: Int? = null,
    var progress: Double? = null,
    var confirme: Boolean? = null,
    var conform: Boolean? = null,
    var cost: Double? = null,
    var minTimeFrame: Int? = null,
    var maxTimeFrame: Int? = null,
    @ManyToOne(cascade = [CascadeType.PERSIST])
    var unit: Unit? = null,
    @OneToOne(cascade = [CascadeType.ALL])
    var container: SampleContainer? = null,
) {
    fun toDomain(): com.lims.domain.model.Sample = com.lims.domain.model.Sample(
        id!!,
        type!!.toDomain(),
        productionDate!!,
        receptionDate!!,
        expirationDate!!,
        measureValue!!,
        employeeResultInterpretation!!,
        adminResultInterpretation!!,
        lotNumber!!,
        progress!!,
        confirme!!,
        conform!!,
        cost!!,
        minTimeFrame!!,
        maxTimeFrame!!,
        unit!!.toDomain(),
        container!!.toDomain()
    )
}
