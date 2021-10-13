package com.lims.domain.usecase

import com.lims.domain.model.Sample
import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType
import com.lims.domain.model.Test
import com.lims.domain.port.api.TestApiPort
import com.lims.domain.port.infrastruture.SampleInfraPort
import com.lims.domain.port.infrastruture.TestInfraPort

class TestUseCase(
    private val testInfraPort: TestInfraPort,
    private val sampleInfraPort: SampleInfraPort,
) : TestApiPort  {
    override fun addTest(test: Test): Test {
        test.price=0.0
        test.samples.map{
            test.price+=it.cost
        }
        return testInfraPort.addTest(test)
    }

    override fun addSampleToTest(sample: Sample, testId: Long): Test {
        var test = testInfraPort.getById(testId)
        test.addSample(sample)
        test.price=0.0
        test.samples.map{
            test.price+=it.cost
        }
        return testInfraPort.update(test)
    }

    override fun changeSampleType(sampleId: Long, sampleType: SampleType): Sample {
        var sample = sampleInfraPort.getById(sampleId)
        sample.type=sampleType
        return sampleInfraPort.updateSample(sample)
    }

    override fun setSampleContainer(sampleId: Long, sampleContainer: SampleContainer): Sample {
        var sample = sampleInfraPort.getById(sampleId)
        return sampleInfraPort.setSampleContainer(sample, sampleContainer)
    }

    override fun updateTest(test: Test): Test {
        test.price=0.0
        test.samples.map{
            test.price+=it.cost
        }
        return testInfraPort.update(test)
    }

    override fun updateSample(sample: Sample): Sample {
        return sampleInfraPort.updateSample(sample)
    }

    override fun updateSampleContainer(id: Long, sampleContainer: SampleContainer): SampleContainer {
        sampleContainer.id = id
        return sampleInfraPort.updateSampleContainer(sampleContainer)
    }

    override fun makeTestAvailable(testId: Long, isAvailable: Boolean): Test {
        var test = testInfraPort.getById(testId)
        test.available = isAvailable
        return testInfraPort.update(test)
    }

    override fun changeTestDescription(testId: Long, description: String): Test {
        var test = testInfraPort.getById(testId)
        test.description=description
        return testInfraPort.update(test)
    }

    override fun changeTestPrice(id: Long, price: Double): Test {
        var test = testInfraPort.getById(id)
        test.price=price
        return testInfraPort.update(test)
    }

    override fun removeSampleFromTest(testId: Long, sample: Sample): Test {
        return sampleInfraPort.removeSampleFromTest(testId, sample)
    }

    override fun getById(id: Long): Test {
        return testInfraPort.getById(id)
    }

    override fun getAll(): Collection<Test> {
        return testInfraPort.getAll()
    }

    override fun deleteTest(testId: Long): Boolean {
        return testInfraPort.deleteTest(testId)
    }

    override fun getAllSamples(): Collection<Sample> {
        return sampleInfraPort.getAll()
    }
}