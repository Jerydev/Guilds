package me.glaremasters.guilds.api.events.challenges

import me.glaremasters.guilds.api.events.base.GuildEvent
import me.glaremasters.guilds.guild.Guild
import org.bukkit.entity.Player

class GuildWarChallengeEvent(player: Player, val challenger: Guild, val defender: Guild) : GuildEvent(player, challenger)