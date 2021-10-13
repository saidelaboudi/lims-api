package com.lims.infrastructure.service

import com.lims.infrastructure.model.Test

interface TestService {
    fun addTest(test: Test): Test
    fun getById(testId: Long): Test
    fun getAll(): Collection<Test>
    fun deleteTest(testId: Long): Boolean
}
