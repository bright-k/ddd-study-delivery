package com.tossplace.ddd.merchant.domain

class MultipleChoiceOptionGroup(
    limitCount: Int,
    options: List<Option>,
) : OptionGroup(OptionGroupType.MULTIPLE, options) {
    var limitCount: Int = limitCount
        private set
}
