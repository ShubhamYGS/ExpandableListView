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
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        LinkedHashMap<String, List<String>> item = new LinkedHashMap<>();

        ArrayList<String> id1 = new ArrayList<>();
        id1.add("Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.");

        item.put("Why Java is platform independent?", id1);


        ArrayList<String> linuxGroups = new ArrayList<>();
        linuxGroups.add("Ubuntu");
        linuxGroups.add("Linux Mint");
        linuxGroups.add("Linux Lite");
        linuxGroups.add("Android");

        item.put("Linux", linuxGroups);

        ArrayList<String> id2 = new ArrayList<>();
        id2.add("Java is not 100% Object-oriented because it makes use of eight primitive datatypes such as boolean, byte, char, int, float, double, long, short which are not objects.");

        item.put("Why java is not 100% Object-oriented?", id2);

        ArrayList<String> id3 = new ArrayList<>();
        id3.add("public : Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.\n" +
                "static : It is a keyword in java which identifies it is class based i.e it can be accessed without creating the instance of a Class.\n" +
                "void : It is the return type of the method. Void defines the method which will not return any value.\n" +
                "main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.\n" +
                "String args[] : It is the parameter passed to the main method.");
        item.put(" Explain public static void main(String args[]).",id3);

        ArrayList<String> id4 = new ArrayList<>();
        id4.add("In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.\n" +
                "\n" +
                "There are two types of constructors:\n" +
                "\n" +
                "Default constructor\n" +
                "Parameterized constructor");
        item.put("What are constructors in Java?",id4);

        ArrayList<String> id5 = new ArrayList<>();
        id5.add("Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.");
        item.put("What is singleton class and how can we make a class singleton?",id5);

        ArrayList<String> id6 = new ArrayList<>();
        id6.add("Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.\n" +
                "“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.");
        item.put("What is the difference between equals() and == ",id6);

        ArrayList<String> id7 = new ArrayList<>();
        id7.add("Hi");
        item.put("Hello",id7);


        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}
