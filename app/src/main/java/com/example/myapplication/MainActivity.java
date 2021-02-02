package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private TextView bonjour;
private EditText name;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bonjour = (TextView)findViewById(R.id.textView);
        name = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button4);
    }
}
