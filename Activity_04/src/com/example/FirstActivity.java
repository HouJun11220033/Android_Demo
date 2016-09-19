package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
	private Button myButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		myButton = (Button) findViewById(R.id.myButton);
		// myButton.setText("");
		myButton.setOnClickListener(new ButtonOnClickListener());

	}

	@Override
	protected void onStart() {
		System.out.println("FirstAcvity --->onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onRestart() {
		System.out.println("FirstAcvity --->onRestart");
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		System.out.println("FirstAcvity --->onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		System.out.println("FirstAcvity --->onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		System.out.println("FirstAcvity --->onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		System.out.println("FirstAcvity --->onDestory");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	class ButtonOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(FirstActivity.this, SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}

	}

}