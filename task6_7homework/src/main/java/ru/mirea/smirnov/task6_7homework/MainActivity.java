package ru.mirea.smirnov.task6_7homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox box = (CheckBox) findViewById(R.id.checkbox);
        Button bn = (Button) findViewById(R.id.button12);
        TextView tv = (TextView) findViewById(R.id.textView4);

        View.OnClickListener clicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("А что об этом думает Джин?");
                box.setChecked(true);
            }
        };
    bn.setOnClickListener(clicked);
    }
    public void onClick(View view){
        TextView tv = (TextView) findViewById(R.id.textView4);
        Toast.makeText(this, "Ненавижу, блин, порталы...", Toast.LENGTH_SHORT).show();
        CheckBox box = (CheckBox) findViewById(R.id.checkbox);
        box.setChecked(false);
        tv.setText("Правильный выбор!");

    }
}