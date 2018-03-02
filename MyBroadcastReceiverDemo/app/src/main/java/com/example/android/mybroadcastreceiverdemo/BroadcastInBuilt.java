package com.example.android.mybroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastInBuilt extends BroadcastReceiver {

    public BroadcastInBuilt() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "Battery is low please Recharge", Toast.LENGTH_SHORT).show();
    }
}
