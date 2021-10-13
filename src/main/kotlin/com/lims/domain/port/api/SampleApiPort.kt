package com.lims.domain.port.api

import com.lims.domain.model.SampleContainer
import com.lims.domain.model.SampleType

interface SampleApiPort {
    fun addSampleType(toDomain: SampleType): SampleType
    fun getAllSamplesTypes(): List<SampleType>
    fun update(toDomain: SampleType): SampleType
    fun deleteSampleType(sampleTypeId: Long)
    fun addUnit(unit: com.lims.domain.model.Unit): com.lims.domain.model.Unit
    fun getAllUnits(): List<com.lims.domain.model.Unit>
    fun updateUnit(unit: com.lims.domain.model.Unit): com.lims.domain.model.Unit
    fun deleteUnit(unitId: Long)
    fun addSampleContainer(sampleContainer: SampleContainer): SampleContainer
    fun deleteSampleContainer(id: Long)
    fun getAllSampleContainers(): List<SampleContainer>
    fun updateSampleContainer(sampleContainer: SampleContainer): SampleContainer
}