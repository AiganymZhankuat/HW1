package com.example.loooooginnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Username = (TextView) findViewById(R.id.person);
        TextView password = (TextView) findViewById(R.id.password);
        Button btn = (Button) findViewById(R.id.close);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("yes");
            }
        });


    }
}