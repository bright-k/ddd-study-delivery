package com.tossplace.ddd.delivery.domain

import com.tossplace.ddd.shared.domain.AggregateRoot

class DeliveryPerson(
    id: Long = 0,
    currentPosition: GeoPoint,
    inDeliveryOrderIds: List<Long>,
) : AggregateRoot() {
    var id: Long = id
        private set

    var inDeliveryOrderIds: List<Long> = inDeliveryOrderIds
        private set

    var currentPosition: GeoPoint = currentPosition
        private set
}
