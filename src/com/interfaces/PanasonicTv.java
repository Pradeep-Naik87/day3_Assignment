package com.interfaces;

public class PanasonicTv implements TvRemote {

	@Override
	public void changeChannel() {
		System.out.println("Change the channel for PanasonicTv");

	}

	@Override
	public void volumeChange() {
		System.out.println("Change the volume for PanasonicTv");

	}

}
