package com.lims.api.ressource

import com.lims.api.model.Sample
import com.lims.api.model.SampleContainer
import com.lims.api.model.SampleType
import com.lims.api.model.Test
import com.lims.domain.port.api.TestApiPort
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
class TestController(
    private val testApiPort: TestApiPort,
) {
    @PostMapping("/tests/")
    fun addTest(@RequestBody test: Test): Test {
        return testApiPort.addTest(test.toDomain()).toApi()
    }

    @GetMapping("/tests/{id}/")
    fun getTest(@PathVariable id: Long): Test {
        return testApiPort.getById(id).toApi()
    }

    @GetMapping("/tests/all")
    fun getAllTests(): Collection<Test> {
        return testApiPort.getAll().map { it.toApi() }
    }

    @DeleteMapping("/tests/{id}/delete")
    fun deleteTest(@PathVariable id: Long): Boolean {
        return testApiPort.deleteTest(id)
    }

    @PutMapping("/tests/update")
    fun updateTest(@RequestBody test: Test): Test {
        return testApiPort.updateTest(test.toDomain()).toApi()
    }

    @PutMapping("/tests/{id}/samples/")
    fun addSampleToTest(@PathVariable testId: Long, @RequestBody sample: Sample): Test {
        return testApiPort.addSampleToTest(sample.toDomain(), testId).toApi()

    }

    @PutMapping("/tests/{id}/price")
    fun changeTestPrice(@PathVariable id: Long, @RequestBody price: Double): Test {
        return testApiPort.changeTestPrice(id, price).toApi()
    }

    @PutMapping("/samples/{id}")
    fun changeSampleType(@PathVariable sampleId: Long, @RequestBody sampleType: SampleType): Sample {
        return testApiPort.changeSampleType(sampleId, sampleType.toDomain()).toApi()
    }

    @PutMapping("/tests/id/description")
    fun changeTestDescription(@PathVariable id: Long, @RequestBody description: String): Test {
        return testApiPort.changeTestDescription(id, description).toApi()
    }

    @PutMapping("/tests/{is}/available")
    fun makeTestAvailable(@PathVariable id: Long, @RequestBody isAvailable: Boolean): Test {
        return testApiPort.makeTestAvailable(id, isAvailable).toApi()
    }

    @PutMapping("tests/{testId}/samples/remove")
    fun removeSampleFromTest(@PathVariable testId: Long, @RequestBody sample: Sample): Test {
        return testApiPort.removeSampleFromTest(testId, sample.toDomain()).toApi()
    }

    @PutMapping("/samples/")
    fun updateSample(@RequestBody sample: Sample): Sample {
        return testApiPort.updateSample(sample.toDomain()).toApi()
    }

    @PutMapping("/samples/{sampleId}/container")
    fun setSampleContainer(@PathVariable sampleId: Long, @RequestBody sampleContainer: SampleContainer): Sample {
        return testApiPort.setSampleContainer(sampleId, sampleContainer.toDomain()).toApi()
    }

    @PutMapping("/samples/{id}/containers")
    fun updateSampleContainer(
        @PathVariable sampleId: Long,
        @RequestBody sampleContainer: SampleContainer,
    ): SampleContainer {
        return testApiPort.updateSampleContainer(sampleId, sampleContainer.toDomain()).toApi()
    }
    @GetMapping("/samples/all")
    fun getAllSamples(): Collection<Sample> {
        return testApiPort.getAllSamples().map { it.toApi() }
    }
}