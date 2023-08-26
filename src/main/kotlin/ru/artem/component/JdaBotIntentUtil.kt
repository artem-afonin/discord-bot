package ru.artem.component

import net.dv8tion.jda.api.requests.GatewayIntent
import org.springframework.stereotype.Service

@Service
class JdaBotIntentUtil {

    fun get(): Collection<GatewayIntent> {
        return listOf(
            GatewayIntent.GUILD_MESSAGES,
            GatewayIntent.MESSAGE_CONTENT,
            GatewayIntent.GUILD_EMOJIS_AND_STICKERS,
            GatewayIntent.GUILD_VOICE_STATES,
            GatewayIntent.SCHEDULED_EVENTS,
        )
    }
}