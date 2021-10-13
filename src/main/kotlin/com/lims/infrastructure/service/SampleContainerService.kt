package com.lims.infrastructure.service

import com.lims.infrastructure.model.SampleContainer

interface SampleContainerService {
    fun save(container: SampleContainer): SampleContainer
    fun getAll(): List<SampleContainer>
    fun update(container: SampleContainer): SampleContainer
    fun delete(id: Long)
}