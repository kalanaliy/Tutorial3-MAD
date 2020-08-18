package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void sendMessage(View view) {

        Button btn = (Button)findViewById(R.id.okbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Sending message...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER,0,5);
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
    }
}