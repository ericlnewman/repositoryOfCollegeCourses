package com.example.androidsignquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView answerText;

    // Initialize the trafficSigns array
    private int[] trafficSigns = {R.drawable.bike_lane,
            R.drawable.yield_to_pedestrians, R.drawable.end_school_speed_limit,
            R.drawable.no_horses};
    private int randomIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Map Buttons to IDs
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        // Map TextView
        answerText = findViewById(R.id.answerText);

        // Generate a random index within the range of the array
        randomIndex = (int) (Math.random() * trafficSigns.length);

        // Set click listeners for buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(R.id.bike);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(R.id.horses);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(R.id.school);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(R.id.yield);
            }
        });

        // Display the traffic sign image for the random index
        displayTrafficSign(trafficSigns[randomIndex]);
    }

    private void displayTrafficSign(int resourceId) {
        FrameLayout layout = (FrameLayout) findViewById(R.id.layout);
        // Remove the topmost view, if any
        if (layout.getChildCount() > 0) {
            layout.removeViewAt(0);
        }

        // Add the new image to the layout
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(resourceId);
        layout.addView(imageView);
    }

    private void checkAnswer(int buttonId) {
        boolean isCorrect = false;

        switch (buttonId) {
            case R.id.bike:
                if (trafficSigns[randomIndex] == R.drawable.bike_lane) {
                    isCorrect = true;
                }
                break;
            case R.id.horses:
                if (trafficSigns[randomIndex] == R.drawable.no_horses) {
                    isCorrect = true;
                }
                break;
            case R.id.school:
                if (trafficSigns[randomIndex] == R.drawable.end_school_speed_limit) {
                    isCorrect = true;
                }
                break;
            case R.id.yield:
                if (trafficSigns[randomIndex] == R.drawable.yield_to_pedestrians) {
                    isCorrect = true;
                }
                break;
        }

        if (isCorrect) {
            answerText.setText("Right!");
        } else {
            answerText.setText("WRONG");
        }

        // Generate a new random index and display the traffic sign image for it
        randomIndex = (int) (Math.random() * trafficSigns.length);
        displayTrafficSign(trafficSigns[randomIndex]);
    }
}
