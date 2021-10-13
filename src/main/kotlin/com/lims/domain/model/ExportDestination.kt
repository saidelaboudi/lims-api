package com.lims.domain.model

class ExportDestination(
    id: Long,
    name: String,
    description: String,
    address: String,
    phonenumber: String,
    fax: String,
    email: String,
    testRequests: ArrayList<TestRequest>,
) {

}
