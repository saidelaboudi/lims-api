package com.lims.infrastructure.service

import com.lims.domain.model.Unit
interface UnitService {
    fun save(unit: Unit) : Unit
    fun getAll(): List<Unit>
    fun update(unit: Unit) : Unit
    fun delete(unitId: Long)
}