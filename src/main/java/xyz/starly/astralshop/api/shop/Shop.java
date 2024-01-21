package xyz.starly.astralshop.api.shop;

import java.util.List;

public interface Shop {

    String getGuiTitle();

    void setGuiTitle(String name);

    String getNpc();

    void setNpc(String npc);

    List<ShopPage> getShopPages();
}