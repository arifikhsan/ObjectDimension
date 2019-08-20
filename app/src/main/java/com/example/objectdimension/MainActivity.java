package com.example.objectdimension;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public View viewBox;
    public TextView textViewInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewBox = findViewById(R.id.viewBox);
        textViewInformation = findViewById(R.id.tv_information);

        viewBox.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewInformation.setText(
                        "viewBox.getWidth(): " + viewBox.getWidth() + "\n" +
                                "viewBox.getHeight(): " + viewBox.getHeight() + "\n" +
                                "viewBox.getX(): " + viewBox.getX() + "\n" +
                                "viewBox.getY(): " + viewBox.getY() + "\n" +
                                "viewBox.getPivotX(): " + viewBox.getPivotX() + "\n" +
                                "viewBox.getPivotY(): " + viewBox.getPivotY() + "\n\n" +

                                "viewBox.getWidth() / 2: " + viewBox.getWidth() / 2 + "\n"
                );
            }
        });

    }
}
