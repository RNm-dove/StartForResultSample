package com.example.ryosuke.startforresultsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        Log.d("Created","created!");

        if (getCallingActivity() != null) {
            Log.d("Created",getCallingActivity().getClassName().toString());
        } else {
            Log.d("Created","getCallingActivity is null!");
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RESUMED","resumed!");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("RETURNED","帰ってきた");


    }
}
