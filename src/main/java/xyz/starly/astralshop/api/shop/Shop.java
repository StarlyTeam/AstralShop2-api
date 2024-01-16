package xyz.starly.astralshop.api.shop;

import xyz.starly.astralshop.api.sound.SoundType;

public interface Shop {

    String getName();

    void setName(String name);

    String getNpc();

    void setNpc(String npc);

    String getSound(SoundType soundType);

    void setSound(SoundType soundType, String name);
}