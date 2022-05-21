package com.example.political_android;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class custom_searchfriend extends BaseAdapter  {
    String[] n,place,post,pho;
    private Context context;
    Button b1;

    public custom_searchfriend(Context applicationContext,String[] pho, String[] n, String[] place, String[] post) {
        this.context = applicationContext;
        this.n = n;
        this.place = place;
        this.post = post;
        this.pho = pho;

    }

    @Override
    public int getCount() {
        return n.length;
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
            gridView=inflator.inflate(R.layout.activity_custom_searchfriend,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        TextView tv1=(TextView)gridView.findViewById(R.id.t1);
        TextView tv2=(TextView)gridView.findViewById(R.id.t2);
        TextView tv3=(TextView)gridView.findViewById(R.id.t3);
        ImageView im=(ImageView) gridView.findViewById(R.id.imageView3);



        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);


        tv1.setText(n[i]);
        tv2.setText(place[i]);
        tv3.setText(post[i]);

//            ImageView im=(ImageView) gridView.findViewById(R.id.imageView101);
            SharedPreferences sh= PreferenceManager.getDefaultSharedPreferences(context);
            String ip=sh.getString("ip","");
            String url="http://" + ip + ":4000"+pho[i];
            Picasso.with(context).load(url). into(im);//circle

        return gridView;


    }

}

