package com.example.countingfrogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToast(View view)
    {
        Toast.makeText(this, "Hello Froggy World", Toast.LENGTH_LONG).show();
    }

}