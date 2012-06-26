package com.backyardbrains;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RoboroachConfigActivity extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roboroach_configuration);	
		View helpButton = findViewById(R.id.rr_help_button);
		helpButton.setOnClickListener(this);
		View cancelButton = findViewById(R.id.rr_cancel_button);
		cancelButton.setOnClickListener(this);
		View saveButton = findViewById(R.id.rr_save_button);
		saveButton.setOnClickListener(this);
	}
	
	boolean ButtonState = false; 
	public void onCheckboxClicked(View v) {
	    // Perform action on clicks, depending on whether it's now checked

		final CheckBox pulseButton = (CheckBox)findViewById(R.id.rr_pulse_button);
		final CheckBox randomButton = (CheckBox)findViewById(R.id.rr_random_button);
		
	    if (pulseButton.isChecked() && ButtonState == false) {
		    	randomButton.setChecked(false);
		    	ButtonState = true;
	    } else if (randomButton.isChecked() && ButtonState == true) {
	    		pulseButton.setChecked(false);
	    		ButtonState = false;
	    }
	}
	
	public void onSave (View v) {
		if (ButtonState == true) { //Pulse Mode
			final EditText StimulationAmpField = (EditText) findViewById(R.id.rr_sti_amp_input);  
			double StimulationAmp = Double.parseDouble(StimulationAmpField.getText().toString());
			
			final EditText PulseWidthField = (EditText) findViewById(R.id.rr_pulse_width_input);  
			double PulseWidth = Double.parseDouble(PulseWidthField.getText().toString()); 
			
			final EditText PulseFreqField = (EditText) findViewById(R.id.rr_pulse_freq_input);  
			double PulseFreq = Double.parseDouble(PulseFreqField.getText().toString()); 
			
			final EditText PulseCountField = (EditText) findViewById(R.id.rr_pulse_count_input);  
			double PulseCount = Double.parseDouble(PulseCountField.getText().toString()); 
			
		}
		else { //Random Mode
			final EditText StimulationTimeField = (EditText) findViewById(R.id.rr_sti_time_input);  
			double StimulationTime = Double.parseDouble(StimulationTimeField.getText().toString()); 
		}
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