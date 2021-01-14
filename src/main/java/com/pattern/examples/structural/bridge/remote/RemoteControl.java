package com.pattern.examples.structural.bridge.remote;

import com.pattern.examples.structural.bridge.device.Device;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
    }

    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 1);
    }

    public void powerOn() {
        if (!this.device.isEnabled()) {
            this.device.switchPower();
        }
    }

    public void powerOff() {
        if (this.device.isEnabled()) {
            this.device.switchPower();
        }
    }
}
