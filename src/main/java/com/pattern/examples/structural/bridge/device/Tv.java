package com.pattern.examples.structural.bridge.device;

public class Tv implements Device {
    private int volume;
    private boolean isEnabled = false;

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void switchPower() {
        if (this.isEnabled) {
            this.isEnabled = false;
        } else {
            this.isEnabled = true;
        }
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "volume=" + volume +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
