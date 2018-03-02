package com.example.android.sharedpreferencedemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit1);
        age = (EditText) findViewById(R.id.edit2);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sh1 = getSharedPreferences("myOwnShared", MODE_PRIVATE);
        String s1 = sh1.getString("user", "");
        int a1 = sh1.getInt("age", 0);

        name.setText(s1);
        age.setText(String.valueOf(a1));
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sh = getSharedPreferences("myOwnShared", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sh.edit();
        myEdit.putString("user", name.getText().toString());
        myEdit.putInt("age", Integer.parseInt(age.getText().toString()));
        myEdit.commit();
    }
}
