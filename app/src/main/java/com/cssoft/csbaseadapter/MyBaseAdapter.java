package com.cssoft.csbaseadapter;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyBaseAdapter extends BaseAdapter {

    List<MyClass> myData;
    Context context;

    public MyBaseAdapter(List<MyClass> data,Context ctx) {
        myData = data;
        context=ctx;

    }


    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(context);
        MyClass obj=myData.get(position);
        String url=obj.url;

        Picasso.get().load(url).into(imageView);

        return imageView;


    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
