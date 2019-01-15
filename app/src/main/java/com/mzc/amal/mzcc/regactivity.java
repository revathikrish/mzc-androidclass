package com.mzc.amal.mzcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regactivity extends AppCompatActivity {
EditText name,admissionno,mbno,email,username,password,conformpasswor;
    Button b1,b2;
    String n,a,m,e,u,p,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regactivity);
        name=(EditText)findViewById(R.id.nam);
        admissionno=(EditText)findViewById(R.id.ad);
        mbno=(EditText)findViewById(R.id.mbno);
        email=(EditText)findViewById(R.id.email);
        username=(EditText)findViewById(R.id.usern);
        password=(EditText)findViewById(R.id.pas);
        conformpasswor=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.alreg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = name.getText().toString();
                a = admissionno.getText().toString();
                m = mbno.getText().toString();
                e = email.getText().toString();
                u = username.getText().toString();
                p = password.getText().toString();
                c = conformpasswor.getText().toString();
                if (p.equals(c)) {
                    Toast.makeText(getApplicationContext(), n, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), m, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), e, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), u, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "password and conform password donot  match", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(getApplicationContext(),MzcActivity.class);
                startActivity(w);
            }
        });
    }
}
