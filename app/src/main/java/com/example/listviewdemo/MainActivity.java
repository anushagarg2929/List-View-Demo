package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView myListView = (ListView)findViewById(R.id.myListView);
//
//        ArrayList<String> myfamily = new ArrayList<String>();
//
//        myfamily.add("Anusha");
//        myfamily.add("Ansh");
//        myfamily.add("Bachuo");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myfamily);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                //parent.setVisibility(View.GONE);
//                Log.i("Person Tapped", myfamily.get(i));
//            }
//        });
        ListView friendListView = (ListView)findViewById(R.id.friendListView);

        final ArrayList<String> myfriends = new ArrayList<String>();
        myfriends.add("Kajal");
        myfriends.add("Sanya");
        myfriends.add("Meemansa");
        myfriends.add("Khushi");
        myfriends.add("Veena");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myfriends);
        friendListView.setAdapter(arrayAdapter);
        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Hello " + myfriends.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}