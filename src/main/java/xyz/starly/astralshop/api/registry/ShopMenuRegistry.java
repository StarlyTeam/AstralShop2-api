package xyz.starly.astralshop.api.registry;

import org.jetbrains.annotations.NotNull;
import xyz.starly.astralshop.api.shop.ShopMenuItem;

import java.util.List;
import java.util.Optional;

public interface ShopMenuRegistry {

    void loadMenuItems();

    boolean addMenuItem(@NotNull ShopMenuItem menuItem);

    boolean removeMenuItem(@NotNull String shopName);

    Optional<ShopMenuItem> getMenuItem(String shopName);

    @NotNull List<ShopMenuItem> getMenuItems();

    String getGuiTitle();

    int getRows();
}