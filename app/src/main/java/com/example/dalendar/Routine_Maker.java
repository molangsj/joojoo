package com.example.dalendar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Routine_Maker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_maker);

        //요일 토글 설정
        ToggleButton toggleButton1=findViewById(R.id.inRtnMkr_Day1tg);
        toggleButton1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton1.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton1.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton2=findViewById(R.id.inRtnMkr_Day2tg);
        toggleButton2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton2.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton2.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton3=findViewById(R.id.inRtnMkr_Day3tg);
        toggleButton3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton3.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton3.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton4=findViewById(R.id.inRtnMkr_Day4tg);
        toggleButton4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton4.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton4.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton5=findViewById(R.id.inRtnMkr_Day5tg);
        toggleButton5.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton5.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton5.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton6=findViewById(R.id.inRtnMkr_Day6tg);
        toggleButton6.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton6.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton6.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        ToggleButton toggleButton7=findViewById(R.id.inRtnMkr_Day7tg);
        toggleButton7.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                toggleButton7.setBackgroundResource(R.drawable.day_picker_checked);
            } else {
                toggleButton7.setBackgroundResource(R.drawable.day_picker_unchecked);
            }
        });

        //스피너
        Spinner spinner1=findViewById(R.id.in_RtnMkr_spinner_am_pm);
        ArrayList<String> timeopt= new ArrayList<>();
        timeopt.add("오전");
        timeopt.add("오후");

        ArrayAdapter<String> ampmAdapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,timeopt);
        ampmAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(ampmAdapter);

        Spinner spinner2=findViewById(R.id.in_RtnMkr_spinner_hour);
        // 시 들어가는 배열
        String[] houropt=new String[12];
        for(int i=0;i< houropt.length;i++){ houropt[i]=String.valueOf(i+1);}

        ArrayAdapter<String> hourAdapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,houropt);
        hourAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner2.setAdapter(hourAdapter);

        Spinner spinner3=findViewById(R.id.in_RtnMkr_spinner_minute);

        String[] minopt=new String[60];
        for (int i=0;i<minopt.length;i++){minopt[i]=String.valueOf(i+1);}

        ArrayAdapter<String> minAdapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,minopt);
        ampmAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner3.setAdapter(minAdapter);
    }
}