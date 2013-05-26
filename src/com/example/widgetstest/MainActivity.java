package com.example.widgetstest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	Clock clock;
	Button button1;
	Button button2;
	MyTime myTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		clock = (Clock) findViewById(R.id.clock);
		ArrayList<Integer> abcc = new ArrayList<Integer>();
		abcc.add(new Integer(0));
		myTime = new MyTime(true, abcc, 13, 0);
		
		clock.addTimePoint(myTime);
		myTime = new MyTime(true, abcc, 15, 20);
		clock.addTimePoint(myTime);
		
		myTime = new MyTime(true, abcc, 14, 20);
		clock.addTimePoint(myTime);
		
		myTime = new MyTime(true, abcc, 18, 20);
		clock.addTimePoint(myTime);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
