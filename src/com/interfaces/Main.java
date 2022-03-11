package com.interfaces;

public class Main {

	public static void main(String[] args) {
		TvRemote tv1 = new BPLTv();
		tv1.changeChannel();
		tv1.volumeChange();

		TvRemote tv2 = new SonyTv();
		tv2.changeChannel();
		tv2.volumeChange();

		TvRemote tv3 = new PanasonicTv();
		tv3.changeChannel();
		tv3.volumeChange();
	}

}
