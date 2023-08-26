package ru.artem.service

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.hooks.EventListener
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class EventListenerBase : EventListener {

    val logger: Logger = LoggerFactory.getLogger(EventListenerBase::class.java)

    override fun onEvent(event: GenericEvent) {
        logger.info("Got event: $event")
    }
}