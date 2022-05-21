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
import android.widget.TextView;


public class CustomComplaint extends BaseAdapter  {
    String[] c,cd,r,rd;
    private Context context;
    Button b1;

    public CustomComplaint(Context applicationContext,String[] cid, String[] c, String[] cd, String[] r,  String[] rd) {
        this.context = applicationContext;
        this.c = c;
        this.cd = cd;
        this.r = r;
        this.rd = rd;
    }

    @Override
    public int getCount() {
        return c.length;
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
            gridView=inflator.inflate(R.layout.activity_custom_complaint,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        TextView tv1=(TextView)gridView.findViewById(R.id.t1);
        TextView tv2=(TextView)gridView.findViewById(R.id.t2);
        TextView tv3=(TextView)gridView.findViewById(R.id.t3);
        TextView tv4=(TextView)gridView.findViewById(R.id.t4);


        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);
        tv3.setTextColor(Color.BLACK);
        tv4.setTextColor(Color.BLACK);


        tv1.setText(c[i]);
        tv2.setText(cd[i]);
        tv3.setText(r[i]);
        tv4.setText(rd[i]);
        return gridView;

    }

}

