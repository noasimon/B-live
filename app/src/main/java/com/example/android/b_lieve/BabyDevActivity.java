package com.example.android.b_lieve;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.method.ScrollingMovementMethod;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class BabyDevActivity extends AppCompatActivity {
    private Button b;
    EditText input;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_baby_dev);
        b=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.editText);
        tv.setMovementMethod(new ScrollingMovementMethod());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input=(EditText)findViewById(R.id.editText);
                tv.setText("Your Question: \n"+input.getText()+"\nEnd.");
            }
        });
    }

}
