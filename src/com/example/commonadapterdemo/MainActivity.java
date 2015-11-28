package com.example.commonadapterdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView listView;
	private ArrayList<String> aList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		aList = new ArrayList<String>();
		aList.add("第一个列表");
		aList.add("第二个列表");
		aList.add("第三个列表");
		listView = (ListView)super.findViewById(R.id.listview);
		listView.setAdapter(new CommonAdapter<String>(MainActivity.this,aList,R.layout.list_dir_item){

			@Override
			public void convert(ViewHolder helper, String item) {
				// TODO Auto-generated method stub
				helper.setText(R.id.id_dir_item_name, item);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
