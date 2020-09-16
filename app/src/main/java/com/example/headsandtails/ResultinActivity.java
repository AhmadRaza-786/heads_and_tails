package com.example.headsandtails;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultinActivity extends AppCompatActivity {
    private ImageView resultImage;
    private Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultin);

        resultImage = findViewById(R.id.imageResult);
        backButton = findViewById(R.id.buttonBack);

        Bundle bundle = getIntent().getExtras();
        int number = bundle.getInt("number");

        if (number == 0) {
            resultImage.setImageResource(R.drawable.moeda_cara);
        } else {
            resultImage.setImageResource(R.drawable.moeda_coroa);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}