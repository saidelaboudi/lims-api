package com.lims.infrastructure.repository

import com.lims.infrastructure.model.SampleType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SampleTypeRepository : JpaRepository<SampleType,Long> {
}