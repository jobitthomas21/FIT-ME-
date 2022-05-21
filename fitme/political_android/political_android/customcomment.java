package com.example.political_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class customcomment extends BaseAdapter {
    String[] un,ph,comm,date;
    private Context context;
    Button b1;

    public customcomment(Context applicationContext,String[] un, String[] ph, String[] comm, String[] date) {
        this.context = applicationContext;
        this.un =un;
        this.ph = ph;
        this.comm = comm;
        this.date = date;
    }

    @Override
    public int getCount() {
        return un.length;
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
        LayoutInflater inflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if(view==null)
        {
            gridView=new View(context);
            //gridView=inflator.inflate(R.layout.customview, null);
            gridView=inflator.inflate(R.layout.activity_customcomment,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        TextView tv1=(TextView)gridView.findViewById(R.id.t1);
        ImageView img=(ImageView)gridView.findViewById(R.id.imageView4);
        TextView tv2=(TextView)gridView.findViewById(R.id.t3);
        TextView tv3=(TextView)gridView.findViewById(R.id.t4);



        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);


        tv1.setText(un[i]);
//        img.setText(ph[i]);
        tv2.setText(comm[i]);
        tv3.setText(date[i]);

//        ImageView im=(ImageView) gridView.findViewById(R.id.imageView101);
        SharedPreferences sh= PreferenceManager.getDefaultSharedPreferences(context);
        String ip=sh.getString("ip","");
        String url="http://" + ip + ":5000"+ph[i];
        Picasso.with(context).load(url). into(img);//circle



        return gridView;

    }




    }

