package com.blotus.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/1/11.
 */
public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        this.setContentView(R.layout.simple_list_item_1);
        ListView listView = (ListView) findViewById(R.id.listview_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new String[]{"a", "b", "c"});
        listView.setAdapter(adapter);
    }
}
