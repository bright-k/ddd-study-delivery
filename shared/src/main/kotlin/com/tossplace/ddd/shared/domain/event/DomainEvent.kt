package com.tossplace.ddd.shared.domain.event

import java.time.Instant

abstract class DomainEvent(
    val occurredOn: Instant = Instant.now()
)
