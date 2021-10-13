package com.lims

import com.lims.domain.model.*
import com.lims.domain.model.employee.*
import com.lims.domain.port.infrastruture.SampleInfraPort
import com.lims.domain.port.infrastruture.TestInfraPort
import com.lims.domain.usecase.TestUseCase
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*
import kotlin.collections.ArrayList

@SpringBootTest
class LimsApplicationTests(val testInfraPort: TestInfraPort,sampleInfraPort: SampleInfraPort) {
/*
    val employee = Employee(
        id = 1L,
        firstname = "",
        lastname ="",
        datebirthday = Date(),
        address = "",
        phonenumber = "",
        email ="",
        policy = Policy(id=1L,allowOverTime=false,vaccationDaysNb=10,maxAllowed="",vaccationNb=12.33,leaveNotificationDate=Date(),
            OverTimeRule(
                id=1L,
                name="",
                priority=1,
                description="",
                condition = Condition(
                    id=1L,
                    minValue=1,
                    maxValue=2,
                    hourRate=23.3
                )
            ),overTimeType= OverTimeType(
                id=1L,
                name="",
                description=""
            )),
        overTimeReq = OverTimeReq(
            id=1L,
            fromDate=Date(),
            toDate=Date(),
            overEstimHour = 12.3
        ),
        attendanceRecord = AttendanceRecord(
            id=1L,
            date=Date(),
            checkIn="",
            checkout=""
        ),
        vacationRequest = VaccationRequest(
            id=1L,
            submitDate=Date(),
            fromDate=Date(),
            toDate=Date(),
            remarks="",
            status=""
        ),
        vacationDay = VacationDay(
            id=1L,
            date=Date(),
            ratio=2f,
            permission=false,
            type=""
        ),
        salary = Salary(
            id=1L,
            amountNer="",
            hourRate=1,
            paymentPeriod= PaymentPeriod(
                id=1L
            )
        ),
        post = Post(
            id=1L,
            minSalary=12.3,
            maxSalary=15.3,
            departement= Departement(
                id=1L,
                name=""
            )
        ),
        overTimeRequest = OverTimeRequest(
            id=1L,
            title="",
            startDate=Date(),
            endDate=Date(),
            hoursNbByEmployee = 12.3,
            hoursNbBySuperviser=52.3,
            overTimeStatus=""
        )
    )

    val pack = Package(id = 1L, name = "", testsCount = 10, price = 10.3, available = false,ArrayList<com.lims.domain.model.Test>())
    val category = Category(id = 1L, name = "")
    val testContainer = TestContainer(id = 1L, name = "", description = "")
    val sampleContainer = SampleContainer(id = 1L, name = "", description = "")

    val test = Test(id = 1L, name = "", description = "", available = true, price = 10.3, ArrayList())

    final val contactInfo = ContactInfo(id = 1L,
        email = "",
        phonenumber = "",
        fax = "",
        whatsapp = "",
        facebook = "",
        twitter = "",
        linkedin = "")

    final val client = Client(
        id = 1L,
        username = "ss",
        password = "ff",
        address = "",
        discount = 10.3,
        active = false,
        contactInfo
    )

    val exportDestination = ExportDestination(id = 1L,
        name = "",
        description = "",
        address = "",
        phonenumber = "",
        fax = "",
        email = "",
        ArrayList<TestRequest>())

    val sampleType = SampleType(id = 1L,
        name = "String",
        description = " String",
        minVolume = 1.2,
        measurement = 2.3,
        stabilityInfo = "",
        unit = Unit(id=1L,name="")
    )

    val sample = Sample(id = 1L,
        type = sampleType,
        productionDate = Date(),
        receptionDate = Date(),
        expirationDate = Date(),
        measureValue = 52.3,
        employeeResultInterpretation = "",
        adminResultInterpretation = "",
        lotNumber = 20,
        progress = 2.3,
        confirmed = false,
        conform = false,
        cost = 2.3,
        minTimeFrame = 1,
        maxTimeFrame = 2,
        unit = Unit(id = 1L, name = ""),
        container = sampleContainer
    )
    val requestStatus = RequestStatus(id = 1L, name = "")
    val taskStatus = TaskStatus(id = 1L, name = "")
    val testRequest = TestRequest(id = 1L,
        progess = 10.3,
        requestStatus = ArrayList<RequestStatus>(),
        taskStatus = ArrayList<TaskStatus>(),
        employee,
        client,
        exportDestination,
        sample
    )

    val company = Company(id = 1L,
        username = "ss",
        password = "ff",
        address = "",
        discount = 10.3,
        active = false,
        financialNumber = "",
        exporter = false,
        BuzinessCategory(),
        ArrayList(),
        contactInfo=contactInfo
    )

    val individual = Individual(id = 1L,
        username = "ss",
        password = "ff",
        address = "",
        discount = 10.3,
        active = false,
        contactInfo=contactInfo
    )

    val testUseCase = TestUseCase(testInfraPort ,sampleInfraPort)


    @Test
    fun contextLoads() {
        assertThat(testUseCase.addTest(test)).isNotNull
        assertThat(testUseCase.addSampleToTest(sample,test)).isNotNull
        assertThat(testUseCase.changeSampleType(sample,sampleType)).isNotNull
        assertThat(testUseCase.setSampleContainer(sample,sampleContainer)).isNotNull
        assertThat(testUseCase.updateTest(1L,test)).isNotNull
        assertThat(testUseCase.updateSample(id=1L,sample)).isNotNull
        assertThat(testUseCase.updateSampleContainer(id=1L,sampleContainer)).isNotNull
        assertThat(testUseCase.makeTestAvailable(1L,true)).isNotNull
        assertThat(testUseCase.changeTestDescription(1L,"")).isNotNull
        assertThat(testUseCase.changeTestPrice(id=1L,15.3)).isNotNull
        assertThat(testUseCase.removeSampleFromTest(1L,sample)).isNotNull
    }
*/
}
