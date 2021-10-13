package com.lims.domain.port.infrastruture

import com.lims.domain.model.Test

interface TestInfraPort {
    fun addTest(test: Test) : Test
    fun update(test: Test): Test
    fun getById(testId: Long): Test
    fun getAll():Collection<Test>
    fun deleteTest(testId: Long): Boolean
}