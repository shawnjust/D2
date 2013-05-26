package com.example.widgetstest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import com.example.widgetstest.Clock.OnChoseListener;

public class MainActivity extends Activity {

	TextView info;
	Clock clock;
	Button button1;
	Button button2;
	MyTime myTime;

	public void init() {
		info = (TextView) findViewById(R.id.info);

		clock.setOnChoseListener(new OnChoseListener() {
			@Override
			public void onChose(int position) {
				MyTime tmpTime = clock.vec.get(position);
				info.setText(tmpTime.message + " " + tmpTime.hour + ":" + tmpTime.minute);
				// for (int i = 0; i < clock.vec.size(); ++i) {
				// MyTime tmpTime = clock.vec.get(i);
				// info.setText(tmpTime.hour + ":" + tmpTime.minute);
				// }
			}
		});
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		clock = (Clock) findViewById(R.id.clock);
		
		ArrayList<Integer> abcc = new ArrayList<Integer>();
		abcc.add(new Integer(0));

		myTime = new MyTime(true, abcc, 22, 00);
		clock.addTimePoint(myTime);
		
		ArrayList<Integer> abcc1 = new ArrayList<Integer>();
		abcc1.add(new Integer(1));
		myTime = new MyTime(true, abcc1, 2, 20);
		clock.addTimePoint(myTime);

		myTime = new MyTime(true, abcc, 18, 10);
		clock.addTimePoint(myTime);

		myTime = new MyTime(true, abcc, 17, 50);
		clock.addTimePoint(myTime);

		init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
