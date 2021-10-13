package com.lims.infrastructure.repository

import com.lims.infrastructure.model.Unit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UnitRepository : JpaRepository<Unit,Long> {
}