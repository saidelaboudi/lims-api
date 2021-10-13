package com.lims.api.ressource

import com.lims.api.model.SampleContainer
import com.lims.api.model.SampleType
import com.lims.api.model.Unit
import com.lims.domain.port.api.SampleApiPort
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
class SampleController(
    private val sampleApiPort: SampleApiPort,
) {
    @PostMapping("/sampleTypes/")
    fun addSampleType(@RequestBody sampleType: SampleType): SampleType {
        return sampleApiPort.addSampleType(sampleType.toDomain()).toApi()
    }

    @GetMapping("/sampleTypes/all")
    fun getAllSampleTypes(): List<SampleType> {
        return sampleApiPort.getAllSamplesTypes().map { it.toApi() }
    }

    @PutMapping("/sampleTypes/update")
    fun updateSampleType(@RequestBody sampleType: SampleType): SampleType {
        return sampleApiPort.update(sampleType.toDomain()).toApi()
    }

    @DeleteMapping("/sampleTypes/{id}/delete")
    fun deleteSampleType(@PathVariable id: Long) {
        sampleApiPort.deleteSampleType(id)
    }

    @PostMapping("/units/")
    fun addUnit(@RequestBody unit: Unit): Unit {
        return sampleApiPort.addUnit(unit.toDomain()).toApi()
    }

    @GetMapping("/units/all")
    fun getAllUnits(): List<Unit> {
        return sampleApiPort.getAllUnits().map{it.toApi()}
    }

    @PutMapping("/units/update")
    fun updateUnit(@RequestBody unit: Unit): Unit {
        return sampleApiPort.updateUnit(unit.toDomain()).toApi()
    }

    @DeleteMapping("/units/{id}/delete")
    fun deleteUnit(@PathVariable id: Long) {
        sampleApiPort.deleteUnit(id)
    }

    @PostMapping("/sampleContainers/")
    fun addSampleContainer(@RequestBody sampleContainer: SampleContainer): SampleContainer {
        return sampleApiPort.addSampleContainer(sampleContainer.toDomain()).toApi()
    }

    @GetMapping("/sampleContainers/all")
    fun getAllSampleContainers(): List<SampleContainer> {
        return sampleApiPort.getAllSampleContainers().map { it.toApi() }
    }

    @PutMapping("/sampleContainers/update")
    fun updateSampleContainer(@RequestBody sampleContainer: SampleContainer): SampleContainer {
        return sampleApiPort.updateSampleContainer(sampleContainer.toDomain()).toApi()
    }

    @DeleteMapping("/sampleContainers/{id}/delete")
    fun deleteSampleContainer(@PathVariable id: Long) {
        sampleApiPort.deleteSampleContainer(id)
    }
}

