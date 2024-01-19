package xyz.starly.astralshop.api.shop;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    Map<UUID, Integer> getLimitBuyCount();

    void setLimitBuyCount(UUID uniqueId, int count);

    Map<UUID, Integer> getLimitSellCount();

    void setLimitSellCount(UUID uniqueId, int count);

    List<String> getCommands();

    void setCommands(List<String> commands);
}