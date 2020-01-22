package com.example.alpha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg="android ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCread() berjalan");

    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.d(msg, "onStart berjalan");
    }

    @NonNull
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "onResume() berjalan");
    }

    @Override
    protected void onPause (){
        super.onPause();
        Log.d(msg,"onPause() berjalan");
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Log.d(msg, "onStop berjalan");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg, "onDestroy () berjalan");
    }
}
