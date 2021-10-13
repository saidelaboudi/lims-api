package com.lims.domain.model

class Company(
    id: Long,
    username: String,
    password: String,
    address: String,
    discount: Double,
    active: Boolean,
    financialNumber: String,
    exporter: Boolean,
    buzinessCategory: BuzinessCategory,
    exportDestinations: ArrayList<ExportDestination>,
    contactInfo: ContactInfo
) :
    Client(id, username, password, address,
        discount,
        active,
        contactInfo) {

}
