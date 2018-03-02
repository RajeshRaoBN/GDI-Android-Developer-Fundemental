package com.example.android.mynewalarm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

public class StandUp extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Inside Receiver",Toast.LENGTH_SHORT).show();

        NotificationManagerCompat myManager = NotificationManagerCompat.from(context);

        NotificationCompat.Builder myNoti = new NotificationCompat.Builder(context);
        myNoti.setContentTitle("Stand UP Notification");
        myNoti.setContentText("You need to Stand UP");
        myNoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i1 = new Intent(context, StandUpActivity.class);
        PendingIntent pd = PendingIntent.getActivity(context, 0, i1, 0);
        myNoti.setContentIntent(pd);

        myNoti.setAutoCancel(true);

        myManager.notify(1, myNoti.build());
    }
}
