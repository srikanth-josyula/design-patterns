package com.sample.behavioral.command;

import com.sample.behavioral.command.command.impl.StartFanCommand;
import com.sample.behavioral.command.command.impl.StopFanCommand;
import com.sample.behavioral.command.command.impl.TurnOnLightCommand;
import com.sample.behavioral.command.services.Fan;
import com.sample.behavioral.command.services.Light;

/**
 * Demo class for HomeAutomation
 *
 */
public class Demo // client
{
	public static void main(String[] args) {
		Light livingRoomLight = new Light(); // receiver 1
		Fan livingRoomFan = new Fan(); // receiver 2
		Light bedRoomLight = new Light(); // receiver 3
		Fan bedRoomFan = new Fan(); // receiver 4

		HomeAutomationRemote remote = new HomeAutomationRemote(); // Invoker

		remote.setCommand(new TurnOnLightCommand(livingRoomLight, "livingRoom"));
		remote.buttonPressed();

		remote.setCommand(new TurnOnLightCommand(bedRoomLight, "bedRoom"));
		remote.buttonPressed();

		remote.setCommand(new StartFanCommand(livingRoomFan, "livingRoom"));
		remote.buttonPressed();

		remote.setCommand(new StopFanCommand(livingRoomFan, "livingRoom"));
		remote.buttonPressed();

		remote.setCommand(new StartFanCommand(bedRoomFan, "bedRoom"));
		remote.buttonPressed();

		remote.setCommand(new StopFanCommand(bedRoomFan, "bedRoom"));
		remote.buttonPressed();
	}
}