package com.lims.domain.model.employee

import java.util.*

class Employee(
    id: Long,
    firstname: String,
    lastname: String,
    datebirthday: Date,
    address: String,
    phonenumber: String,
    email: String,
    policy: Policy,
    overTimeReq: OverTimeReq,
    attendanceRecord: AttendanceRecord,
    vacationRequest: VaccationRequest,
    vacationDay: VacationDay,
    salary: Salary,
    post: Post,
    overTimeRequest: OverTimeRequest
) {

}
