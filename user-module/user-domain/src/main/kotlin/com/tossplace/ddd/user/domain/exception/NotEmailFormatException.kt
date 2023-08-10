package com.tossplace.ddd.user.domain.exception

import com.tossplace.ddd.shared.domain.exception.DomainException

class NotEmailFormatException(
    override val message: String? = null,
    val inputEmail: String? = null,
) : DomainException(message)