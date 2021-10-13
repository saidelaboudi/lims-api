package com.lims.domain.port.infrastruture

import com.lims.domain.model.Sample
import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType
import com.lims.domain.model.Test
import com.lims.domain.model.Unit

interface SampleInfraPort {
    fun changeSampleType(sample: Sample, sampleType: SampleType): Sample
    fun setSampleContainer(sample: Sample, sampleContainer: SampleContainer): Sample
    fun updateSample(sample: Sample): Sample
    fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer
    fun removeSampleFromTest(id: Long, sample: Sample): Test
    fun getById(sampleId: Long): Sample
    fun addSampleType(sampleType: SampleType): SampleType
    fun getAllSampleTypes(): List<SampleType>
    fun deleteSampleType(id: Long)
    fun updateSampleTypes(sampleType: SampleType): SampleType
    fun getAll(): Collection<Sample>
    fun addUnit(unit: Unit): Unit
    fun getAllUnits(): List<Unit>
    fun updateUnit(unit: Unit): Unit
    fun deleteUnit(unitId: Long)
    fun addSampleContainer(sample: SampleContainer): SampleContainer
    fun getAllSampleContainers(): List<SampleContainer>
    fun updateSampleContainers(sample: SampleContainer): SampleContainer
    fun deleteSampleContainer(id: Long)
}