package com.example.switchview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: clicked button one");
        ImageView firstimage = (ImageView) findViewById(R.id.imageView1);
        int imageResource = getResources().getIdentifier("@drawable/hi",null,this.getPackageName());
        firstimage.setImageResource(imageResource);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(MainActivity.this, secondscreen.class);
                startActivity(intent);
            }
        });


    }
}
