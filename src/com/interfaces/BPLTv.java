package com.interfaces;

public class BPLTv implements TvRemote {

	@Override
	public void changeChannel() {
		System.out.println("Change the channel for BPLTv");

	}

	@Override
	public void volumeChange() {
		System.out.println("Change the volume for BPLTv");

	}

}
