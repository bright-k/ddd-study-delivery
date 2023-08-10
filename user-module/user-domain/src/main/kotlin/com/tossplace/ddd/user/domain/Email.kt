package com.tossplace.ddd.user.domain

import com.tossplace.ddd.user.domain.exception.NotEmailFormatException

data class Email(
    val email: String,
) {
    init {
        validate()
    }

    private fun validate() {
        // email 포매싱 아니면 예외
        if (false) {
            throw NotEmailFormatException(inputEmail = this.email)
        }
    }
}