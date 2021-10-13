package com.lims.infrastructure.service

import com.lims.infrastructure.model.SampleType

interface SampleTypeService {
    fun save(sampleType: SampleType): SampleType
    fun getAll(): List<SampleType>
    fun delete(id: Long)
    fun update(sampleType: SampleType): SampleType
}