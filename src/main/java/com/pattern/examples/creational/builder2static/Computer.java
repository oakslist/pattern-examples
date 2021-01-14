package com.pattern.examples.creational.builder2static;

public class Computer {

    private final String hdd;
    private final String ram;
    private final String processor;
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class Builder {
        private final String hdd;
        private final String ram;
        private String processor;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        Builder withProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        Builder setGaphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
