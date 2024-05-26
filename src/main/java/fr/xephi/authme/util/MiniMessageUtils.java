package fr.xephi.authme.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer;
import net.md_5.bungee.api.chat.BaseComponent;

public class MiniMessageUtils {
    private static final MiniMessage mm = MiniMessage.miniMessage();

    public static BaseComponent[] parseMiniMessage(String message) {
        Component component = mm.deserialize(message);
        return BungeeComponentSerializer.get().serialize(component);
    }
}
