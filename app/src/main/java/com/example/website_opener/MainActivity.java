package com.example.website_opener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        e1=findViewById(R.id.editTextTextPersonName);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getCallingActivity(),"hellk",Toast.LENGTH_SHORT).show();
                String str=e1.getText().toString();
                Uri web=Uri.parse("http://"+str);
                Intent i =new Intent(Intent.ACTION_VIEW,web);
                if(i.resolveActivity(getPackageManager())!=null);
                {
                    startActivity(i);
                }
               // i.setData(Uri.parse("http://"+str));
                //startActivity(i);

            }
        });
    }
}
