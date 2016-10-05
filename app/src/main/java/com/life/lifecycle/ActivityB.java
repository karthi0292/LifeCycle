package com.life.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        final Button clickButton = (Button) findViewById(R.id.click);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragmentA()).commit();
                clickButton.setVisibility(View.GONE);
            }
        });
        Log.d("Actvity B", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Actvity B", "onStart  called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Actvity B", "onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Actvity B", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Actvity B", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Actvity B", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Actvity B", "onDestroy called");
    }
}
