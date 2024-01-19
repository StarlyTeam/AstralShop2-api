package xyz.starly.astralshop.api.shop.handler;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

public interface ItemTypeHandler {

    void serialize(ItemStack itemStack, ConfigurationSection section);

    void deserialize(ItemStack itemStack, ConfigurationSection section);
}