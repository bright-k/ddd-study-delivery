package com.tossplace.ddd.order.domain

class Option(
    name: String,
    price: Long,
) {
    var name: String = name
        private set

    var price: Long = price
        private set
}