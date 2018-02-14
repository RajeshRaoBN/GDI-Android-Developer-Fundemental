package com.example.android.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.tv1);
        //t.setText(R.string.hello);

        Toast.makeText(this,"onCreate Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onRestart");
    }
}
