package xyz.starly.astralshop.api.shop;

import java.util.Map;

public interface ShopPage {

    int getPageNum();

    void setPageNum(int pageNum);

    Map<Integer, ShopItem> getItems();

    void setItems(Map<Integer, ShopItem> items);

    String getGuiTitle();

    void setGuiTitle(String inventoryName);

    int getRows();

    void setRows(int rows);
}