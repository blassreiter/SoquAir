package com.example.soquair;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.soquair.android.SoquAirManager;

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
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == 4){
			
			new AlertDialog.Builder(this).setTitle("是否退出？").setPositiveButton("是", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					System.exit(0);
				}
			}).setNeutralButton("否", null).show();
			return true;
		}else{
			return super.onKeyDown(keyCode, event);
		}
	}

	@Override
	public void onClick(View view) {
		if (view == btn_push) {
			SoquAirManager.getInstance().initSoquAirManager(this);
		}
	}

}
