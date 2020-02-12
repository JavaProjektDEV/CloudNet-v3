package de.dytanic.cloudnet.ext.bridge.bukkit.event;

import de.dytanic.cloudnet.driver.service.ServiceInfoSnapshot;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public final class BukkitCloudServiceStopEvent extends BukkitCloudNetEvent {

    private static HandlerList handlerList = new HandlerList();

    private final ServiceInfoSnapshot serviceInfoSnapshot;

    public BukkitCloudServiceStopEvent(ServiceInfoSnapshot serviceInfoSnapshot) {
        this.serviceInfoSnapshot = serviceInfoSnapshot;
    }

    public static HandlerList getHandlerList() {
        return BukkitCloudServiceStopEvent.handlerList;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public ServiceInfoSnapshot getServiceInfoSnapshot() {
        return this.serviceInfoSnapshot;
    }
}