package ru.artem.component

import jakarta.annotation.PostConstruct
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.hooks.EventListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class JdaBot {

    @Value("\${discord.bot.token}")
    lateinit var token: String

    @Autowired
    lateinit var listeners: Collection<EventListener>

    @Autowired
    lateinit var jdaBotIntentUtil: JdaBotIntentUtil

    lateinit var jda: JDA

    @PostConstruct
    fun init() {
        jda = JDABuilder
            .createDefault(token)
            .setEnabledIntents(jdaBotIntentUtil.get())
            .addEventListeners(*listeners.toTypedArray())
            .build()
            .awaitReady()
    }
}