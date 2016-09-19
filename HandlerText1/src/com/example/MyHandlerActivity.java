package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MyHandlerActivity extends Activity {
	TextView textView = null;
	Button button = null;
	MyHandler myHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = (TextView) findViewById(R.id.testHandler1);
		Button button = (Button) findViewById(R.id.testHandler2);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myHandler = new MyHandler();
				Mythread mythread = new Mythread();
				mythread.start();

			}
		});

	}

	class MyHandler extends Handler {

		@Override
		public void handleMessage(Message msg) {
			// Log.d("MyHandler", "handleMessage...");

			super.handleMessage(msg);
			Bundle bundle = msg.getData();
			String color = bundle.getString("color");
			button.setText(color);

		}

	}

	class Mythread extends Thread {

		public void run() {
			try {

				Thread.sleep(1000);
				System.out.println("!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Log.d("thread...", "MyThread....");
			Message message = new Message();
			Bundle bundle = new Bundle();
			bundle.putString("color", "my");
			message.setData(bundle);
			MyHandlerActivity.this.myHandler.sendMessage(message);

		}

	}

}
