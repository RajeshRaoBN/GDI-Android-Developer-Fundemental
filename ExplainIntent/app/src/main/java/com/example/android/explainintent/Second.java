package com.example.android.explainintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.result);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("user");
        txt1.setText(s1);
    }
}
