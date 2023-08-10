package com.tossplace.ddd.order.domain

open class OptionGroup(
    type: OptionGroupType,
    options: List<Option>,
) {
    var type: OptionGroupType = type
        private set

    var options: List<Option> = options
        private set

    enum class OptionGroupType {
        EXCLUSIVE,
        MULTIPLE,
    }
}
