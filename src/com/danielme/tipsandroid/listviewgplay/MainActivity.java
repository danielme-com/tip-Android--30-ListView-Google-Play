package com.danielme.tipsandroid.listviewgplay;

import java.util.ArrayList;
import java.util.List;

import com.danieme.tipsandroid.listviewgplay.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * 
 * @author danielme.com
 *
 */
public class MainActivity extends ListActivity
{
 
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<String> rows = new ArrayList<String>(30);
		for (int i = 1; i < 31; i++)
		{
			rows.add("Lorem ipsum dolor sit amet...");
		}
		setListAdapter(new ArrayAdapter<String>(this, R.layout.text_view, rows));
	}
}