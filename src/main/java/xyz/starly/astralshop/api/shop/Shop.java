package xyz.starly.astralshop.api.shop;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Shop {

    @NotNull String getName();

    void setName(@NotNull String name);

    String getGuiTitle();

    void setGuiTitle(String name);

    String getNpc();

    void setNpc(String npc);

    List<ShopPage> getShopPages();
}