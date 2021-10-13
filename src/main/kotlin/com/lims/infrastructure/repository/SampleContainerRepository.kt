package com.lims.infrastructure.repository

import com.lims.infrastructure.model.SampleContainer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SampleContainerRepository:JpaRepository<SampleContainer,Long> {
}