package xyz.starly.astralshop.api.shop;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ShopItem {

    ItemStack getItemStack();

    double getBuyPrice();

    void setBuyPrice(double price);

    double getSellPrice();

    void setSellPrice(double price);

    int getStock();

    void setStock(int stock);

    int getRemainStock();

    void setRemainStock(int stock);

    List<String> getCommands();

    void setCommands(List<String> commands);
}