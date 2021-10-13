package com.lims.infrastructure.config

import com.lims.domain.port.infrastruture.SampleInfraPort
import com.lims.domain.port.infrastruture.TestInfraPort
import com.lims.domain.usecase.SampleUseCase
import com.lims.domain.usecase.TestUseCase
import com.lims.infrastructure.adapter.SampleInfraAdapter
import com.lims.infrastructure.adapter.TestInfraAdapter
import com.lims.infrastructure.service.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class Config {
    @Bean
    open fun testInfraAdapter(testService: TestService): TestInfraAdapter = TestInfraAdapter(testService)

    @Bean
    open fun sampleInfraAdapter(
        sampleService: SampleService,
        sampleTypeService: SampleTypeService,
        unitService: UnitService,
        sampleContainerService: SampleContainerService,
    ): SampleInfraAdapter = SampleInfraAdapter(sampleService, sampleTypeService, unitService, sampleContainerService)

    @Bean
    open fun configTestBean(
        testInfraPort: TestInfraPort,
        sampleInfraPort: SampleInfraPort,
    ): TestUseCase = TestUseCase(testInfraPort, sampleInfraPort)

    @Bean
    open fun configSampleBean(sampleInfraPort: SampleInfraPort): SampleUseCase = SampleUseCase(sampleInfraPort)
}