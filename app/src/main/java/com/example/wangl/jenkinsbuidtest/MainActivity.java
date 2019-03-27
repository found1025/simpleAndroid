package com.example.wangl.jenkinsbuidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View view){
        TextView textView = (TextView) findViewById(R.id.outView);
        textView.setText("It is a wonderful world too, while sometimes it's anoying");


        }

}
