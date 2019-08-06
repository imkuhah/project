package com.example.switchview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondscreen extends AppCompatActivity {
    private static final String TAG = "secondscreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen_layout);
        Log.d(TAG, "onCreate: clicked button two ");
        ImageView firstimage = (ImageView) findViewById(R.id.imageView2);
        int imageResource = getResources().getIdentifier("@drawable/bye",null,this.getPackageName());
        firstimage.setImageResource(imageResource);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: started");
                Intent intent = new Intent(secondscreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

