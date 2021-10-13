package com.lims.infrastructure.service

import com.lims.infrastructure.model.Sample
import com.lims.infrastructure.model.SampleContainer
import com.lims.infrastructure.model.SampleType
import com.lims.infrastructure.model.Test

interface SampleService {
    fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer
    fun removeSampleFromTest(testId: Long, sample: Sample): Test
    fun updateSample(sample: Sample): Sample
    fun setSampleContainer(sample: Sample, sampleContainer: SampleContainer): Sample
    fun changeSampleType(sample: Sample, sampleType: SampleType): Sample
    fun getById(sampleId: Long): Sample
    fun getAll(): Collection<Sample>
}