package ru.mirea.serebriakovaea.systemintentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBrows(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://yandex.ru/images/search?from=tabbar&text=cat&pos=32&img_url=http%3A%2F%2Fi.pinimg.com%2Foriginals%2F5d%2Fc6%2F1d%2F5dc61d72241c478234aa6720b658562d.jpg&rpt=simage&lr=11164"));
        startActivity(intent);
    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:89929999999"));
        startActivity(intent);
    }

    public void openMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:61.379918, 59.005799"));
        startActivity(intent);
    }
}