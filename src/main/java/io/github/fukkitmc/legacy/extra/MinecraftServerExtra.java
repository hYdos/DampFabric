package io.github.fukkitmc.legacy.extra;

import net.minecraft.server.PlayerList;
import net.minecraft.server.PropertyManager;
import net.minecraft.server.UserCache;

public interface MinecraftServerExtra {

    int getIdleTimeout();

    void setIdleTimeout(int timeout);

    default PropertyManager getPropertyManager(){
        throw new RuntimeException("No. not yet tm");
    }

    String getVersion();

    boolean getSpawnAnimals();

    boolean getAllowFlight();

    boolean isHardcore();

    void safeShutdown();

    String getMotd();

    UserCache getUserCache();

    void stop();

    PlayerList getPlayerList();

    boolean getOnlineMode();

    void setOnlineMode(boolean flag);

    void setPVP(boolean flag);

    boolean getPVP();

    void setSpawnAnimals(boolean flag);

    void setAllowFlight(boolean flag);

    void setMotd(String s);
}
