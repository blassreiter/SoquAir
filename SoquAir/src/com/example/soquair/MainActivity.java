package com.example.soquair;

import com.soquair.android.SoquAirManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btn_push;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_push = (Button) findViewById(R.id.btn_push);
		btn_push.setOnClickListener(this);		
	}

	@Override
	public void onClick(View view) {
		if (view == btn_push) {
			SoquAirManager.getInstance().initSoquAirManager(this);			
		}
	}	

}
