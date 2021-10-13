package com.lims.domain.port.api

import com.lims.domain.model.Sample
import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType
import com.lims.domain.model.Test

interface TestApiPort {
    fun addTest(test: Test): Test
    fun addSampleToTest(sample: Sample, testId: Long): Test
    fun changeSampleType(sampleId: Long, sampleType: SampleType): Sample
    fun setSampleContainer(sampleId: Long, sampleContainer: SampleContainer): Sample
    fun updateTest(test: Test): Test
    fun updateSample(sample: Sample): Sample
    fun updateSampleContainer(id: Long, sampleContainer: SampleContainer): SampleContainer
    fun makeTestAvailable(id: Long, b: Boolean): Test
    fun changeTestDescription(id: Long, s: String): Test
    fun changeTestPrice(id: Long, d: Double): Test
    fun removeSampleFromTest(id: Long, sample: Sample): Test
    fun getById(id: Long): Test
    fun getAll(): Collection<Test>
    fun deleteTest(testId: Long): Boolean
    fun getAllSamples(): Collection<Sample>
}