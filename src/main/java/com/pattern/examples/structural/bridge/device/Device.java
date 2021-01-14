package com.pattern.examples.structural.bridge.device;

public interface Device {
    boolean isEnabled();
    void switchPower();
    void setVolume(int volume);
    int getVolume();
}
