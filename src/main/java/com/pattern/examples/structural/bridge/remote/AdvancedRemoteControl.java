package com.pattern.examples.structural.bridge.remote;

import com.pattern.examples.structural.bridge.device.Device;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
