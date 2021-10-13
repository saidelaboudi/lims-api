package com.lims.infrastructure.service.impl

import com.lims.infrastructure.model.SampleType
import com.lims.infrastructure.repository.SampleTypeRepository
import com.lims.infrastructure.service.SampleTypeService
import org.springframework.stereotype.Service

@Service
class SampleTypeServiceImpl(
    private val sampleTypeRepository: SampleTypeRepository
) : SampleTypeService {
    override fun save(sampleType: SampleType): SampleType {
        return sampleTypeRepository.save(sampleType)
    }

    override fun getAll(): List<SampleType> {
        return sampleTypeRepository.findAll()
    }

    override fun delete(id: Long) {
        sampleTypeRepository.deleteById(id)
    }

    override fun update(sampleType: SampleType): SampleType {
        return sampleTypeRepository.save(sampleType)
    }

}