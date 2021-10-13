package com.lims.infrastructure.repository

import com.lims.infrastructure.model.Test
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository : JpaRepository<Test,Long> {
}