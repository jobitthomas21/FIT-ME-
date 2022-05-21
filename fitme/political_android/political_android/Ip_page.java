package com.example.political_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ip_page extends AppCompatActivity implements View.OnClickListener {
    EditText ip1;
    Button s;
    SharedPreferences sh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip_page);
        ip1=(EditText)findViewById(R.id.editText);
        s=(Button)findViewById(R.id.button);

        sh= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        ip1.setText(sh.getString("ip",""));
        s.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        String ipaddress=ip1.getText().toString();
//        Toast.makeText(this, ipaddress+",", Toast.LENGTH_SHORT).show();
        String url1 = "http://" + ipaddress + ":4000/";
        SharedPreferences.Editor ed=sh.edit();
        ed.putString("ip",ipaddress);
        ed.putString("url",url1);
        ed.commit();
        Intent i=new Intent(getApplicationContext(),Login.class);
        startActivity(i);
    }

}
