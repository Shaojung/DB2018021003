package com.example.student.db2018021003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mydata;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydata = new ArrayList<>();
        mydata.add("AA");
        mydata.add("Apple");
        mydata.add("橘子");
        mydata.add("西瓜");
        mydata.add("BB");
        mydata.add("CC");
        mydata.add("AA2");
        mydata.add("Apple2");
        mydata.add("橘子2");
        mydata.add("西瓜2");
        mydata.add("BB2");
        mydata.add("CC2");
        lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
        android.R.layout.simple_list_item_1, mydata);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, mydata.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        lv.setAdapter(adapter);

    }
}
