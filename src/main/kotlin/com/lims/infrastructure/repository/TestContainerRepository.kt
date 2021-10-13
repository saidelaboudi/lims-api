package com.lims.infrastructure.repository

import com.lims.infrastructure.model.TestContainer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestContainerRepository :JpaRepository<TestContainer,Long>{
}