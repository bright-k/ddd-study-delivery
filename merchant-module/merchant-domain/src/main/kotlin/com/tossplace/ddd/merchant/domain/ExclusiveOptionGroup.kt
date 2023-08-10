package com.tossplace.ddd.merchant.domain

class ExclusiveOptionGroup(
    options: List<Option>,
) : OptionGroup(OptionGroupType.EXCLUSIVE, options) {
}
