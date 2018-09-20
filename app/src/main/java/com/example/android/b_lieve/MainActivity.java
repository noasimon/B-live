package com.example.android.b_lieve;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mButtonQuiz = (ImageView) findViewById(R.id.quiz);
        mButtonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(i);
            }
        });
        ImageView mButtonForum = (ImageView) findViewById(R.id.forum);
        mButtonForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ForumActivity.class);
                startActivity(i);
            }
        });
        ImageView mButtonMeetings = (ImageView) findViewById(R.id.meet_ups);
        mButtonMeetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MeetingsActivity.class);
                startActivity(i);
            }
        });

        ImageView mButtonCall = (ImageView) findViewById(R.id.call_button);
        mButtonCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                phoneIntent.setData(Uri.parse("tel:1201"));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);

                }
                startActivity(phoneIntent);
            }
        });
    }
}

