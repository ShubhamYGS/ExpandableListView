package com.example.shubham.expnadablellistview;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        HashMap<String, List<String>> item = new HashMap<>();

        ArrayList<String> linuxGroups = new ArrayList<>();
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Linux Mint");
        linuxGroups.add("Linux Lite");
        linuxGroups.add("Android");

        item.put("Linux", linuxGroups);

        ArrayList<String> windowsGroups = new ArrayList<>();
        windowsGroups.add("Windows");
        windowsGroups.add("Windows NT");
        windowsGroups.add("Windows RT");
        windowsGroups.add("Windows Mobile");

        item.put("Windows", windowsGroups);

        ArrayList<String> id1 = new ArrayList<>();
        id1.add("Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.");

        item.put("Why Java is platform independent?", id1);

        ArrayList<String> id2 = new ArrayList<>();
        id2.add("Hi");
        item.put("Hello",id2);

        ArrayList<String> id3 = new ArrayList<>();
        id3.add("Hi1");
        item.put("Hello1",id3);

        ArrayList<String> id4 = new ArrayList<>();
        id4.add("Hi2");
        item.put("Hello2",id4);

        ArrayList<String> id5 = new ArrayList<>();
        id5.add("Hi3");
        item.put("Hello3",id5);

        ArrayList<String> id6 = new ArrayList<>();
        id6.add("Hi4");
        item.put("Hello4",id6);

        ArrayList<String> id7 = new ArrayList<>();
        id7.add("Hi5");
        item.put("Hello5",id7);

        ArrayList<String> id8 = new ArrayList<>();
        id8.add("Hi6");
        item.put("Hello6",id8);

        ArrayList<String> id9 = new ArrayList<>();
        id9.add("Hi7");
        item.put("Hello7",id9);

        ArrayList<String> id25 = new ArrayList<>();
        id25.add("Hi8");
        item.put("Hello8",id25);

        ArrayList<String> id26 = new ArrayList<>();
        id26.add("Hi9");
        item.put("Hello9",id26);

        ArrayList<String> id28 = new ArrayList<>();
        id28.add("Hi10");
        item.put("Hello10",id28);

        ArrayList<String> id0 = new ArrayList<>();
        id0.add("Hi11");
        item.put("Hello11",id0);



        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}
