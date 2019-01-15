package com.mzc.amal.mzcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
EditText n1,n2;
    Button bb;
    String n11,n12,s;
    int number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        n1=(EditText)findViewById(R.id.no1);
        n2=(EditText)findViewById(R.id.no2);
        bb=(Button)findViewById(R.id.cal);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n11=n1.getText().toString();
                n12=n2.getText().toString();
                number1=Integer.parseInt(n11);
                number2=Integer.parseInt(n12);
                number3=number1+number2;
                s=String.valueOf(number3);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
        });
    }
}
