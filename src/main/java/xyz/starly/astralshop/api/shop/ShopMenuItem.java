package xyz.starly.astralshop.api.shop;

import org.bukkit.inventory.ItemStack;

public interface ShopMenuItem {

    int getSlot();

    ItemStack getItemStack();

    String getShop();
}