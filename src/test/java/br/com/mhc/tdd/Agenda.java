package br.com.mhc.tdd;

import java.util.Timer;
import java.util.TimerTask;

public class Agenda {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Oi, sou uma agenda");
			}
		}, 0, 5000);
	}
	
}
