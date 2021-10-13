package com.lims.infrastructure.model

import javax.persistence.*

@Entity
@Table
class TestContainer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?=null,
    val name: String?=null,
    val description: String?=null,
) {

}
