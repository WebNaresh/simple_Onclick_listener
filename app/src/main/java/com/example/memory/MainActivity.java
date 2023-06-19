package com.example.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int currentIndex=1;
    int [] array ={R.drawable.o,R.drawable.one,R.drawable.two,R.drawable.three};

    public void backword(View view) {
        ImageView img = findViewById(R.id.imageView);

        if (currentIndex>1){
            currentIndex--;
            Log.d("TAG", "backword: "+currentIndex);
            img.setImageResource(array[currentIndex-1]);
        }
    }

    public void forword(View view) {
        ImageView img = findViewById(R.id.imageView);

        Log.d("TAG", "backword: "+4);
        if (currentIndex<4){
            currentIndex++;
            Log.d("TAG", "backword: "+currentIndex);
            img.setImageResource(array[currentIndex-1]);
        }
    }
}