package com.tossplace.ddd.merchant.domain

class MenuGroup(
    merchantId: Long,
    name: String,
    menus: List<Menu>
) {
    var merchantId: Long = merchantId
        private set

    var name: String = name
        private set

    var menus: List<Menu> = menus
        private set
}
