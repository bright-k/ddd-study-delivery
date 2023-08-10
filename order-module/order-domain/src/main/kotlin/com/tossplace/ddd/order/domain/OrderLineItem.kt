package com.tossplace.ddd.order.domain

class OrderLineItem(
    orderId: Long,
    name: String,
    quantity: Int,
    price: Long,
    optionGroups: List<OptionGroup>,
) {
    var orderId: Long = orderId
        private set

    var name: String = name
        private set

    var quantity: Int = quantity
        private set

    var price: Long = price
        private set

    var optionGroups: List<OptionGroup> = optionGroups
        private set
}
