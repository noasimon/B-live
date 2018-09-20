package com.example.android.b_lieve;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;

public class MeetingsActivity extends AppCompatActivity {
    CalendarView calendar;
    String mDateText;
    EditText mPlaceText;

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meetings);
        calendar = (CalendarView) findViewById(R.id.calendar_view);
        mPlaceText = (EditText)findViewById(R.id.textPlace);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                mDateText= String.valueOf(dayOfMonth) +'/'+String.valueOf(month)+'/'+String.valueOf(year);
                calendar.setVisibility(View.INVISIBLE);
                mPlaceText.setVisibility(View.VISIBLE);

            }
        });
    }
}
