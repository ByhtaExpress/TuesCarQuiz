package com.example.euphoria.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page_1 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_page_1);

            Button button_correct = (Button) findViewById(R.id.button_correct);
            button_correct.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    startActivity(new Intent(page_1.this, page_2.class));

                }
            });
        }
    }