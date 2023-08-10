package com.tossplace.ddd.shared.domain

import com.tossplace.ddd.shared.domain.event.DomainEvent
import jakarta.persistence.Transient
import mu.KotlinLogging

abstract class AggregateRoot {
    @Transient
    private val domainEvents: MutableList<DomainEvent> = mutableListOf()

    protected fun raise(event: DomainEvent) {
        log.debug("raied domain event. [type=${event::class.simpleName}]")
        this.domainEvents.add(event)
    }

    fun occurredEvents(): List<DomainEvent> {
        val events = this.domainEvents.toList()
        this.domainEvents.clear()
        log.debug("return occurred events. [numberOfEvents=${events.size}]")
        return events
    }

    companion object {
        private val log = KotlinLogging.logger { }
    }
}
