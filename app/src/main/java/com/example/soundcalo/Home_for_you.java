package com.example.soundcalo;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home_for_you extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_for_you);

        ImageView imageView = findViewById(R.id.imageView5);

        ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0.3f, 1f);
        fadeInOut.setDuration(2000); // 2 giây
        fadeInOut.setRepeatCount(ObjectAnimator.INFINITE);
        fadeInOut.setRepeatMode(ObjectAnimator.REVERSE);
        fadeInOut.start();
    }
}