package com.example.ryan.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

class MyView extends LinearLayout {	
	private EditText display;

	public MyView(Activity activity) {
		super(activity, null);
		LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.display, this);
		display = (EditText) findViewById(R.id.editString);
	}
	
	public void setView(String s) { display.setText(s); }
}