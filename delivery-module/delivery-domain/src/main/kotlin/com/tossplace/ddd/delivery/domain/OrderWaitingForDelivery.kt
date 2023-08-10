package com.tossplace.ddd.delivery.domain

import com.tossplace.ddd.shared.domain.AggregateRoot

class OrderWaitingForDelivery(
    id: Long = 0,
    orderId: Long,
    merchantId: Long,
    orderedId: Long,
    address: String,
) : AggregateRoot() {
    var id: Long = id
        private set

    var orderId: Long = orderId
        private set

    var merchantId: Long = merchantId
        private set

    var orderedId: Long = orderedId
        private set

    var address: String = address
        private set
}
