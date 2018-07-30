package com.example.waqarcci.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        tv1 = (TextView)findViewById(R.id.textView1);
        tv2= (TextView) findViewById(R.id.textView2);

        close = (Button) findViewById(R.id.close);


        tv1.setText("Salary" + getIntent().getStringExtra("+1"));
        tv2.setText("Days" + getIntent().getStringExtra("-1"));


       /* Intent mylocalIntent = getIntent();

        double value1 = mylocalIntent.getDoubleExtra("Salary", -1);
        double value2 = mylocalIntent.getDoubleExtra("Days", -1);

        double result = value1+value2;

        close.setText("Data Recieved is \n"
                +"val1= " + value1 +" \n val2=" + value2
                +"\n\n result=" + result
        );*/


    }
}
