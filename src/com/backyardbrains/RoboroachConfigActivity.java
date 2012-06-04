package com.backyardbrains;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class RoboroachConfigActivity extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roboroach_configuration);	
		View helpButton = findViewById(R.id.rr_help_button);
		helpButton.setOnClickListener(this);
	}

	public void onClick(View b) {
		// TODO Auto-generated method stub
		switch (b.getId()) {
		case R.id.rr_help_button:
			Intent help = new Intent(this, RoboroachHelpActivity.class);
			startActivity(help);
			break;	
		case R.id.rr_cancel_button:
			Intent cancel = new Intent(this, RoboroachActivity.class);
			startActivity(cancel);
			break;
		case R.id.rr_save_button:
			Intent save = new Intent(this, RoboroachActivity.class);
			startActivity(save);
			break;
		}

	}
}