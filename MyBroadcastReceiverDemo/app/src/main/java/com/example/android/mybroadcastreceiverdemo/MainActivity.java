package com.example.android.mybroadcastreceiverdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callInBuilt(View view) {

    }

    public void callCustom(View view) {
        Intent i1 = new Intent();
        i1.setAction("com.example.android.myboardcastreceiverdemo.call");
        i1.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i1);
    }
}
