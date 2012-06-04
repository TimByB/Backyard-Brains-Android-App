package com.backyardbrains;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class RoboroachActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roboroach_main);
		
		//Set up click listeners for all buttons
		View aboutButton = findViewById(R.id.rr_config_button);
		aboutButton.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.rr_config_button:
			Intent config = new Intent(this, RoboroachConfigActivity.class);
			startActivity(config);
			break;
		case R.id.rr_left_button:
			
			break;
		case R.id.rr_right_button:
			
			break;
		}
	}


}
