package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	private RadioGroup genderGroup = null;
	private RadioButton femaleButton = null;
	private RadioButton maleButton = null;
	private CheckBox swimBox;
	private CheckBox runBox;
	private CheckBox readBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ..................................................................
		genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
		femaleButton = (RadioButton) findViewById(R.id.femaleButton);
		maleButton = (RadioButton) findViewById(R.id.maleButton);
		swimBox = (CheckBox) findViewById(R.id.swim);
		runBox = (CheckBox) findViewById(R.id.run);
		readBox = (CheckBox) findViewById(R.id.read);

		genderGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if (femaleButton.getId() == checkedId) {
					System.out.println("famale");
					Toast.makeText(MainActivity.this, "famale", Toast.LENGTH_SHORT).show();
				} else if (maleButton.getId() == checkedId) {
					System.out.println("male");
					Toast.makeText(MainActivity.this, "male", Toast.LENGTH_SHORT).show();

				}

			}
		});

		swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("swim is checked");
				} else {
					System.out.println("swim is unchecked");
				}

			}

		});
		runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("run is checked");
				} else {
					System.out.println("run is unchecked");
				}

			}

		});
		readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					System.out.println("read is checked");
				} else {
					System.out.println("read is unchecked");
				}

			}

		});

	}

}
