package com.example.dalendar;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class RoutinePlus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_plus);

        ImageButton search_button = findViewById(R.id.in_RtnPlus_search);
        ImageButton plus_button = findViewById(R.id.in_RtnPlus_plus);

        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(RoutinePlus.this, RoutineList.class);
                startActivity(intent);
            }
        });
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(RoutinePlus.this, RoutineRecommand.class);
                startActivity(intent);
            }
        });
    }
}