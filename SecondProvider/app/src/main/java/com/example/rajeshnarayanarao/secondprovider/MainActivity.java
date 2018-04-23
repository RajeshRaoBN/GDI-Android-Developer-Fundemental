package com.example.rajeshnarayanarao.secondprovider;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String AUTHORITY = "com.rajesh.my.company.provider";
    public static final Uri CONTENT_URI_1 = Uri.parse("content://" + AUTHORITY + "/emp");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doLoading(View view) {
        Cursor cr = getContentResolver().query(CONTENT_URI_1, null,
                null, null, "_id");
        StringBuilder stringBuilder = new StringBuilder();

        while (cr.moveToNext()) {
            int id = cr.getInt(0);
            String s1 = cr.getString(1);
            String s2 = cr.getString(2);
            stringBuilder.append(id + "    " + s1 + "   " + s2 + "\n");
        }

        Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_LONG).show();
    }
}
