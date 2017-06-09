package com.example.dell.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private DownloadBinder mBinder = new DownloadBinder();
    class DownloadBinder extends Binder
    {
        public void startDownload()
        {
            Log.d("MyService","startDownload executed");
        }
        public int getProgress()
        {
            Log.d("MyService","getProgress executed");
            return 0;
        }
    }
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService","onCreate executed");
        //只在服務第一次創建的時候被調用
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService","onStartCommend executed");
        return super.onStartCommand(intent, flags, startId);
        //每次服務啟動的時候被調用
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService","onDestroy execited");
    }
}
