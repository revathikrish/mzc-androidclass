package com.mzc.amal.mzcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MzcActivity extends AppCompatActivity {
EditText ed1,ed2;
    Button b;
    String getusername,getpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mzc);
        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.login);

       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               getusername=ed1.getText().toString();
               getpassword=ed2.getText().toString();
               Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_LONG).show();
//               Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
          }
       });
    }
}
