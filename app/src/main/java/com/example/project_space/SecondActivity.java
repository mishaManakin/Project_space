package com.example.project_space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.button1);
        button.setOnClickListener(listener);




    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
            startActivity(intent);

        }
    };
}