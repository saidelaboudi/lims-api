package com.lims.infrastructure.service.impl

import com.lims.infrastructure.model.Sample
import com.lims.infrastructure.model.SampleContainer
import com.lims.infrastructure.model.SampleType
import com.lims.infrastructure.model.Test
import com.lims.infrastructure.repository.SampleContainerRepository
import com.lims.infrastructure.repository.SampleRepository
import com.lims.infrastructure.repository.TestRepository
import com.lims.infrastructure.service.SampleService
import org.springframework.stereotype.Service

@Service

class SampleServiceImpl(
    private val sampleRepository: SampleRepository,
    private val sampleContainerRepository: SampleContainerRepository,
    private val testRepository: TestRepository
) : SampleService {
    override fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer {
        return sampleContainerRepository.save(sampleContainer)
    }

    override fun removeSampleFromTest(testId: Long, sample: Sample): Test {
        sampleRepository.delete(sample)
        return testRepository.findById(testId).get()
    }

    override fun updateSample(sample: Sample): Sample {
        return sampleRepository.save(sample)
    }

    override fun setSampleContainer(sample: Sample, sampleContainer: SampleContainer): Sample {
        sample.container=sampleContainer
        return sampleRepository.save(sample)
    }

    override fun changeSampleType(sample: Sample, sampleType: SampleType): Sample {
        sample.type=sampleType
        return sampleRepository.save(sample)
    }

    override fun getById(sampleId: Long): Sample {
        return sampleRepository.findById(sampleId).get()
    }

    override fun getAll(): Collection<Sample> {
        return sampleRepository.findAll()
    }
}