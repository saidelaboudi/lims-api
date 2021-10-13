package com.lims.domain.model

class Individual(
    id: Long,
    username: String,
    password: String,
    address: String,
    discount: Double,
    active: Boolean,
    contactInfo: ContactInfo
) :
    Client(id, username, password, address,
        discount,
        active,
        contactInfo) {

}
