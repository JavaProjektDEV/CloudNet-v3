package de.dytanic.cloudnet.ext.bridge.proxprox;

import de.dytanic.cloudnet.driver.network.HostAndPort;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Locale;
import java.util.UUID;

@ToString
@EqualsAndHashCode
final class ProxProxCloudNetPlayerInfo {

    private UUID uniqueId;

    private Locale locale;

    private String name, xBoxId;

    private HostAndPort address, connectedServer;

    private long ping;

    public ProxProxCloudNetPlayerInfo(UUID uniqueId, Locale locale, String name, String xBoxId, HostAndPort address, HostAndPort connectedServer, long ping) {
        this.uniqueId = uniqueId;
        this.locale = locale;
        this.name = name;
        this.xBoxId = xBoxId;
        this.address = address;
        this.connectedServer = connectedServer;
        this.ping = ping;
    }

    public UUID getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXBoxId() {
        return this.xBoxId;
    }

    public void setXBoxId(String xBoxId) {
        this.xBoxId = xBoxId;
    }

    public HostAndPort getAddress() {
        return this.address;
    }

    public void setAddress(HostAndPort address) {
        this.address = address;
    }

    public HostAndPort getConnectedServer() {
        return this.connectedServer;
    }

    public void setConnectedServer(HostAndPort connectedServer) {
        this.connectedServer = connectedServer;
    }

    public long getPing() {
        return this.ping;
    }

    public void setPing(long ping) {
        this.ping = ping;
    }

}