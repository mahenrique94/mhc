package br.com.mhc.bamble;

import java.io.File;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

public class TestaBamble {

	public static void main(String[] args) {
		Properties props = Bamble.getProperties(new File("bamble.properties"));
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Bamble().start(props);
			}
		}, 0, Integer.parseInt(props.getProperty("bamble.sleep")));
	}
	
}
