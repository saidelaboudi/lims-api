package com.lims.infrastructure.service.impl

import com.lims.domain.model.Unit
import com.lims.infrastructure.repository.UnitRepository
import com.lims.infrastructure.service.UnitService
import org.springframework.stereotype.Service

@Service
class UnitServiceImpl (
    private val unitRepository: UnitRepository
        ): UnitService {
    override fun save(unit: Unit): Unit {
        return unitRepository.save(unit.toInfra()).toDomain()
    }

    override fun getAll(): List<Unit> {
        return unitRepository.findAll().map{it.toDomain()}
    }

    override fun update(unit: Unit): Unit {
        return unitRepository.save(unit.toInfra()).toDomain()
    }

    override fun delete(unitId: Long) {
        unitRepository.deleteById(unitId)
    }
}