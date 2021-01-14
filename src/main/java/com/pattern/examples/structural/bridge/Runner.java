package com.pattern.examples.structural.bridge;

import com.pattern.examples.structural.bridge.device.Radio;
import com.pattern.examples.structural.bridge.device.Tv;
import com.pattern.examples.structural.bridge.remote.AdvancedRemoteControl;
import com.pattern.examples.structural.bridge.remote.RemoteControl;

public class Runner {

    public static void main(String[] args) {
        Radio radio = new Radio();
        RemoteControl remoteControl = new RemoteControl(radio);
        remoteControl.powerOn();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        System.out.println(radio);

        Tv tv = new Tv();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(tv);
        advancedRemoteControl.powerOn();
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        System.out.println(tv);
        advancedRemoteControl.mute();
        System.out.println(tv);

    }

}
