package com.example.android.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[], s2[];
    int imageResource[] = {R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon};

    myOwnAdaptor ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView)findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.pet_name);
        s1 = getResources().getStringArray(R.array.desc);

        ad = new myOwnAdaptor(this, s1, s2, imageResource);
    }
}
