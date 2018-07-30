package com.example.waqarcci.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     text1 = (EditText)findViewById(R.id.txt1);
     text2 =  (EditText) findViewById(R.id.txt2);
     btnsend = (Button) findViewById(R.id.btnadd);

    }

    public void sendData(View view)
    {
            Double v1 = Double.parseDouble(text1.getText().toString());
            Double v2 = Double.parseDouble(text2.getText().toString());

        Intent intent = new Intent(this, Activity2.class);

        intent.putExtra("Salary", v1);
        intent.putExtra("Days", v2);
        startActivity(intent);

    }
}
