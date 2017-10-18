package com.example.lenovo.sensor_sample;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Smitha on 17-Oct-17.
 */

public class Myservices extends Service {


    public void onCreate() {
        Context context = getApplicationContext();
        Fall_test.initiate(context);

    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        long now = System.currentTimeMillis();
        Intent falltest = new Intent(this, Examples.class);
        return (START_STICKY);

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}
