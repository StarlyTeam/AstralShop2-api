package xyz.starly.astralshop.api.shop;

import java.util.List;

public interface ShopPage {

    int getPageNum();

    void setPageNum(int pageNum);

    List<ShopItem> getItems();

    void setItems(List<ShopItem> items);

    String getInventoryName();

    void setInventoryName(String inventoryName);

    int getRows();

    void setRows(int rows);
}