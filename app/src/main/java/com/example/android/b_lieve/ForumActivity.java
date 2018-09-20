package com.example.android.b_lieve;



        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.ImageView;

public class ForumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ImageView mButtonBabyDev = (ImageView) findViewById(R.id.baby_icon);
        mButtonBabyDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent baby = new Intent(getApplicationContext(), BabyDevActivity.class);
                startActivity(baby);
            }
        });

        ImageView mButtonSleep = (ImageView) findViewById(R.id.sleep_icon);
        mButtonSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sleep = new Intent(getApplicationContext(), BabyDevActivity.class);
                startActivity(sleep);
            }
        });

        ImageView mButtonHow = (ImageView) findViewById(R.id.mom_dad_icon);
        mButtonHow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent how = new Intent(getApplicationContext(), BabyDevActivity.class);
                startActivity(how);
            }
        });

        ImageView mButtonHowIFeel = (ImageView) findViewById(R.id.mom_icon);
        mButtonHowIFeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iFeel = new Intent(getApplicationContext(), BabyDevActivity.class);
                startActivity(iFeel);
            }
        });
    }

}
