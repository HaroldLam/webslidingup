package com.example.webslidingup;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		super.loadUrl("file:///android_asset/www/index.html");
	}

}
