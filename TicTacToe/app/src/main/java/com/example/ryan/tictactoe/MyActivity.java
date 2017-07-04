package com.example.ryan.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

public class MyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 

		final MyModel myModel = new MyModel();
		final MyView myView = new MyView(this);
	    final MyController myController = new MyController(this, myModel, myView);
	    
	    ViewGroup container = (ViewGroup) findViewById(R.id.myLayout);
	    container.addView(myView);
	    container.addView(myController);  
	}
}
