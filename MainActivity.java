package com.example.tank_android_learning;

import static android.content.Intent.ACTION_SENDTO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    //Declaration of variables
    EditText EdNumber;
    EditText EdMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assigning user input values to the declared variables
        EdNumber = findViewById(R.id.editTextPhone);
        EdMsg = findViewById(R.id.editTextTextPersonName2);

    }

    //Calling the user input phone no.
    public void callClick(View view) {
        String num = EdNumber.getText().toString();
        Intent in1 = new Intent(Intent.ACTION_DIAL);
        in1.setData(Uri.parse("tel:" + num));
        startActivity(in1);
    }

    //Sending a user input SMS a to user input phone no.
    public void smsClick(View view) {
        String num = EdNumber.getText().toString();
        String msg = EdMsg.getText().toString();
        Intent in2 = new Intent(Intent.ACTION_SENDTO);
        in2.setData(Uri.parse("sms:" + num));
        in2.putExtra("sms_body", msg);
        startActivity(in2);
    }

    //Transitioning to next page
    public void NextPage(View view) {
        Intent in3 = new Intent(this, Second_Activity.class);
        startActivity(in3);

    }
}