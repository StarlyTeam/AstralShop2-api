package xyz.starly.astralshop.api.registry;

import xyz.starly.astralshop.api.shop.Shop;

import java.util.List;

public interface ShopRegistry {

    boolean createShop(String name, int rows);

    boolean deleteShop(String name);

    boolean updateShop(String name);

    boolean updateShops();

    Shop getShop(String name);

    List<Shop> getShops();
}