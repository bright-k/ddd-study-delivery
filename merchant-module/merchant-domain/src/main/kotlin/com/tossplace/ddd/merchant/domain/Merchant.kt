package com.tossplace.ddd.merchant.domain

import com.tossplace.ddd.shared.domain.AggregateRoot

class Merchant(
    id: Long = 0,
    name: String,
    address: String,
    businessNumber: String,
    openingHours: OpeningHours,
) : AggregateRoot() {
    var id: Long = id
        private set

    var name: String = name
        private set

    var address: String = address
        private set

    var businessNumber: String = businessNumber
        private set

    var openingHours: OpeningHours = openingHours
        private set
}
