package com.lims.infrastructure.repository

import com.lims.infrastructure.model.Sample
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SampleRepository : JpaRepository<Sample,Long>{
}