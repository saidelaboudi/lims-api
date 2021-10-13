package com.lims.infrastructure.service.impl

import com.lims.infrastructure.model.Test
import com.lims.infrastructure.repository.TestRepository
import com.lims.infrastructure.service.TestService
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(
    private val testRepository: TestRepository
) : TestService {
    override fun addTest(test: Test): Test {
        return testRepository.save(test)
    }

    override fun getById(testId: Long): Test {
        return testRepository.findById(testId).get()
    }

    override fun getAll(): Collection<Test> {
        return testRepository.findAll()
    }

    override fun deleteTest(testId: Long): Boolean {
        testRepository.deleteById(testId)
        return true
    }

}
