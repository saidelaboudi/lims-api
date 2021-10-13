package com.lims.infrastructure.adapter

import com.lims.domain.model.Test
import com.lims.domain.port.infrastruture.TestInfraPort
import com.lims.infrastructure.service.TestService

class TestInfraAdapter(
    private val testService: TestService
):TestInfraPort {
    override fun addTest(test: Test): Test {
        return testService.addTest(test.toInfra()).toDomain()
    }

    override fun update(test: Test): Test {
        return testService.addTest(test.toInfra()).toDomain()
    }

    override fun getById(testId: Long): Test {
        return testService.getById(testId).toDomain()
    }

    override fun getAll(): Collection<Test> {
        return testService.getAll().map{it.toDomain()}
    }

    override fun deleteTest(testId: Long): Boolean {
        return testService.deleteTest(testId)
    }
}