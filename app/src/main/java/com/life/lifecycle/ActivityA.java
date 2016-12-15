package com.life.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        Log.d("Actvity A","onCreate called");

        Intent intent=new Intent(this,ActivityB.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Actvity A","onStart  called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Actvity A","onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Actvity A","onResume called");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Actvity A","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Actvity A","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Actvity A","onDestroy called");
    }
}
