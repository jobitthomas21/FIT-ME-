package com.example.political_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class custompost extends BaseAdapter {
    String[] pid, post, date;
    private Context context;
    Button b1;

    public custompost(Context applicationContext, String[] pid, String[] post, String[] date) {
        this.context = applicationContext;
        this.pid = pid;
        this.post = post;
        this.date = date;

    }

    @Override
    public int getCount() {
        return pid.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if (view == null) {
            gridView = new View(context);
            //gridView=inflator.inflate(R.layout.customview, null);
            gridView = inflator.inflate(R.layout.activity_custompost, null);//same class name

        } else {
            gridView = (View) view;

        }
//        TextView tv1 = (TextView) gridView.findViewById(R.id.t4);
        TextView tv2 = (TextView) gridView.findViewById(R.id.t5);
        TextView tv3 = (TextView) gridView.findViewById(R.id.t6);


//        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);


//        tv1.setText(pid[i]);
        tv2.setText(post[i]);
        tv3.setText(date[i]);
//
        return gridView;

    }


}