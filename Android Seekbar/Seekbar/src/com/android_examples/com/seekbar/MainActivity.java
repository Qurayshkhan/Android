package com.android_examples.com.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	SeekBar seekBar;
	TextView txtSeekBar;
	int textSize = 3;
	int saveProgress;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtSeekBar = (TextView)findViewById(R.id.textView1);
		txtSeekBar.setTextScaleX(textSize);
		seekBar = (SeekBar)findViewById(R.id.seekBar1);
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) 
			{

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) 
			{

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) 
			{
				textSize = textSize + (progress-saveProgress);
				saveProgress = progress;
				txtSeekBar.setTextSize(textSize);
			}
		});

	}
}
