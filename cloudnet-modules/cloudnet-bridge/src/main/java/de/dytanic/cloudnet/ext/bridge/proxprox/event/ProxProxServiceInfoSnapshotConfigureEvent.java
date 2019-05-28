package de.dytanic.cloudnet.ext.bridge.proxprox.event;

import de.dytanic.cloudnet.driver.service.ServiceInfoSnapshot;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class ProxProxServiceInfoSnapshotConfigureEvent extends
  ProxProxCloudNetEvent {

  @Getter
  private final ServiceInfoSnapshot serviceInfoSnapshot;
}