package com.lims.infrastructure.service.impl

import com.lims.infrastructure.model.SampleContainer
import com.lims.infrastructure.repository.SampleContainerRepository
import com.lims.infrastructure.service.SampleContainerService
import org.springframework.stereotype.Service

@Service
class SampleContainerServiceImpl(
    private val sampleContainerRepository: SampleContainerRepository
) : SampleContainerService {
    override fun save(container: SampleContainer): SampleContainer {
        return sampleContainerRepository.save(container)
    }

    override fun getAll(): List<SampleContainer> {
        return sampleContainerRepository.findAll()
    }

    override fun update(container: SampleContainer): SampleContainer {
        return sampleContainerRepository.save(container)
    }

    override fun delete(containerId: Long) {
        sampleContainerRepository.deleteById(containerId)
    }
}