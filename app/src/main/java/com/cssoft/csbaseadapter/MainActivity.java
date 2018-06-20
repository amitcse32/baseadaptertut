package com.cssoft.csbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyClass> images=new ArrayList<>();
        MyClass obj=new MyClass();
        obj.url="https://ibcdn.imagesbazaar.com/img1024/16555/SM709479.jpg";
        obj.name="NAME1";

        images.add(obj);



        MyClass obj1=new MyClass();
        obj1.url="https://ibcdn.imagesbazaar.com/img1024/16544/SM708575.jpg";
        obj1.name="NAME1";

        images.add(obj1);







        MyBaseAdapter adapter=new MyBaseAdapter(images,this);
        GridView listView=findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }

    public void hello()
    {

    }
}
