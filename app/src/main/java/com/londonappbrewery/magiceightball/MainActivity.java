package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        get button
        Button askButton = (Button)findViewById(R.id.askButton);
//        get decision image view
        final ImageView decisionImage = (ImageView)findViewById(R.id.decisionImage);
//        create array of images from drawable folder to change decision
        final int[] decisionImages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
//        set onclick listener on button
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                create random number between 0 to 4
                Random randomNumber = new Random();

//                create new random number
                int number = randomNumber.nextInt(5);

//                set decision image according to random number
                decisionImage.setImageResource(decisionImages[number]);

            }
        });
    }
}
