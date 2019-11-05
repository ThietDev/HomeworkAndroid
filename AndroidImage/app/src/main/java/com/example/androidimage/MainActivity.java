package com.example.androidimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivlike;
    int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivlike = findViewById(R.id.image_like);
        ivlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0) {
                    ivlike.setImageResource(R.drawable.cover);
                } else {
                    ivlike.setImageResource(R.drawable.thiet);
                }
                count++;
            }
        });
    }
}
