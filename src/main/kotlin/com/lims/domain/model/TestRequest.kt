package com.lims.domain.model

import com.lims.domain.model.employee.Employee

class TestRequest(
    id: Long,
    progess: Double,
    requestStatus: ArrayList<RequestStatus>,
    taskStatus: ArrayList<TaskStatus>,
    employee: Employee,
    client: Client,
    exportDestination: ExportDestination,
    sample: Sample
) {

}
