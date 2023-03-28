package ru.mirea.serebriakovaea.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editTextTextPersonName);

    }

    public void sendData(View view) {
        String result = editText.getText().toString();
        Intent resultIntent = new Intent();
        resultIntent.putExtra("Result", result);

        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
