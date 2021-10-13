package com.lims.domain.usecase

import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType
import com.lims.domain.model.Unit
import com.lims.domain.port.api.SampleApiPort
import com.lims.domain.port.infrastruture.SampleInfraPort

class SampleUseCase(
    private val sampleInfraPort: SampleInfraPort
) : SampleApiPort {
    override fun addSampleType(sample: SampleType): SampleType {
        return sampleInfraPort.addSampleType(sample).toDomain()
    }

    override fun getAllSamplesTypes(): List<SampleType> {
        return sampleInfraPort.getAllSampleTypes().map { it.toDomain() }
    }

    override fun update(sample: SampleType): SampleType {
        return sampleInfraPort.updateSampleTypes(sample).toDomain()
    }

    override fun deleteSampleType(id: Long) {
        sampleInfraPort.deleteSampleType(id)
    }

    override fun addUnit(unit: com.lims.domain.model.Unit) : com.lims.domain.model.Unit{
        return sampleInfraPort.addUnit(unit)
    }

    override fun getAllUnits(): List<com.lims.domain.model.Unit> {
        return sampleInfraPort.getAllUnits()
    }

    override fun updateUnit(unit: com.lims.domain.model.Unit) : com.lims.domain.model.Unit{
        return sampleInfraPort.updateUnit(unit)
    }

    override fun deleteUnit(unitId: Long) {
        sampleInfraPort.deleteUnit(unitId)
    }

    override fun addSampleContainer(sample: SampleContainer): SampleContainer {
        return sampleInfraPort.addSampleContainer(sample)
    }

    override fun deleteSampleContainer(id: Long) {
        sampleInfraPort.deleteSampleContainer(id)
    }

    override fun getAllSampleContainers(): List<SampleContainer> {
        return sampleInfraPort.getAllSampleContainers()
    }

    override fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer {
        return sampleInfraPort.updateSampleContainers(sampleContainer)
    }
}