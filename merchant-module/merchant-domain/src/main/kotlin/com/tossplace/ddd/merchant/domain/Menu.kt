package com.tossplace.ddd.merchant.domain

class Menu(
    merchantId: Long,
    name: String,
    optionGroups: List<OptionGroup>,
    price: Long,
    order: Int,
) {
    var merchantId: Long = merchantId
        private set

    var name: String = name
        private set

    var optionGroups: List<OptionGroup> = optionGroups
        private set

    var price: Long = price
        private set

    var order: Int = order
        private set
}
