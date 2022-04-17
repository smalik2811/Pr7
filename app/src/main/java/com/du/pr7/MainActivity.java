package com.du.pr7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private RadioButton red, green, blue;
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent_layout);
        group = findViewById(R.id.group);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

       group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               if(red.isChecked()){
                   parent.setBackgroundColor(Color.RED);
               }else if(green.isChecked()){
                   parent.setBackgroundColor(Color.GREEN);
               }else if(blue.isChecked()){
                   parent.setBackgroundColor(Color.BLUE);
               }
           }
       });
    }
}