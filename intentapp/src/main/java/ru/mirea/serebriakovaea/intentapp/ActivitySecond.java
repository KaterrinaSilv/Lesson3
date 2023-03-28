package ru.mirea.serebriakovaea.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String value  = bundle.getString("time");
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Квадрат значения моего номера по списку составляет " + 22*22 + " а текущее время: "+ value);
        }
    }
}
