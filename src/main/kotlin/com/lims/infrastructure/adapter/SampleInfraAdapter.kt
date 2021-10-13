package com.lims.infrastructure.adapter

import com.lims.domain.model.Sample
import com.lims.domain.model.Unit
import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType
import com.lims.domain.model.Test
import com.lims.domain.port.infrastruture.SampleInfraPort
import com.lims.infrastructure.service.SampleContainerService
import com.lims.infrastructure.service.SampleService
import com.lims.infrastructure.service.SampleTypeService
import com.lims.infrastructure.service.UnitService

class SampleInfraAdapter (
    private val sampleService: SampleService,
    private val sampleTypeService: SampleTypeService,
    private val unitService: UnitService,
    private val sampleContainerService: SampleContainerService
        ): SampleInfraPort {
    override fun changeSampleType(sample: Sample, sampleType: SampleType): Sample {
        return sampleService.changeSampleType(sample.toInfra(),sampleType.toInfra()).toDomain()
    }

    override fun setSampleContainer(sample: Sample, sampleContainer: SampleContainer): Sample {
        return sampleService.setSampleContainer(sample.toInfra(), sampleContainer.toInfra()).toDomain()
    }

    override fun updateSample(sample: Sample): Sample {
        return sampleService.updateSample(sample.toInfra()).toDomain()
    }

    override fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer {
        return sampleService.updateSampleContainer(sampleContainer.toInfra()).toDomain()
    }

    override fun removeSampleFromTest(testId: Long, sample: Sample): Test {
        return sampleService.removeSampleFromTest(testId,sample.toInfra()).toDomain()
    }

    override fun getById(sampleId: Long): Sample {
        return sampleService.getById(sampleId).toDomain()
    }

    override fun addSampleType(sampleType: SampleType): SampleType {
        return sampleTypeService.save(sampleType.toInfra()).toDomain()
    }

    override fun getAllSampleTypes(): List<SampleType> {
        return sampleTypeService.getAll().map{it.toDomain()}
    }

    override fun deleteSampleType(id: Long) {
        sampleTypeService.delete(id)
    }

    override fun updateSampleTypes(sampleType: SampleType): SampleType {
        return sampleTypeService.update(sampleType.toInfra()).toDomain()
    }

    override fun getAll(): Collection<Sample> {
        return sampleService.getAll().map{it.toDomain()}
    }

    override fun addUnit(unit: Unit) : Unit {
        return unitService.save(unit)
    }

    override fun getAllUnits(): List<Unit> {
        return unitService.getAll()
    }

    override fun updateUnit(unit: Unit) : Unit{
        return unitService.update(unit)
    }

    override fun deleteUnit(unitId: Long) {
        unitService.delete(unitId)
    }

    override fun addSampleContainer(container: SampleContainer): SampleContainer {
        return sampleContainerService.save(container.toInfra()).toDomain()
    }

    override fun getAllSampleContainers(): List<SampleContainer> {
        return sampleContainerService.getAll().map{it.toDomain()}
    }

    override fun updateSampleContainers(container: SampleContainer): SampleContainer {
        return sampleContainerService.update(container.toInfra()).toDomain()
    }

    override fun deleteSampleContainer(id: Long) {
        sampleContainerService.delete(id)
    }
}