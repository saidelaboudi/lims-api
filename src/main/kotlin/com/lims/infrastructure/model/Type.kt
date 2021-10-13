package com.lims.infrastructure.model

import java.util.*
import javax.persistence.*

@Entity
@Table
class Type(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,
    val price: Double? = null,
    val date: Date? = null,
    val active: Boolean? = null,
    @ManyToOne(cascade = [CascadeType.ALL])
    val unit: Unit? = null,
    val minimal: Double? = null,
    val maximal: Double?=null,
) {

}
