package com.example.android.b_lieve;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private TextView question;
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private Button next;
    private QuizViewModel[] questions = new QuizViewModel[]{

            new QuizViewModel("במשך השבוע האחרון, הייתי מסוגלת לצחוק ולראות את הצד המצחיק של דברים",
                    "כפי שיכולתי תמיד",
                    "פחות מתמיד",
                    "הרבה פחות מתמיד",
                    "בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, ציפיתי בהנאה לדברים שיקרו",
                    "כפי שיכולתי תמיד",
                    "פחות משהייתי רגילה",
                    "הרבה פחות משהייתי רגילה",
                    "כמעט בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, האשמתי את עצמי שלא לצורך, כאשר הדברים לא הסתדרו",
                    "כן, רוב הזמן",
                    "כן, חלק מהזמן",
                    "לעתים רחוקות",
                    "אף פעם"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי חרדה או דאגה ללא כל סיבה",
                    "בכלל לא",
                    "לעתים רחוקות",
                    "כן, לפעמים",
                    " כן, לעתים קרובות מאוד"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי מפוחדת או מבוהלת ללא כל סיבה מוצדקת",
                    "כן, לעתים קרובות",
                    "כן, לפעמים",
                    "לעתים רחוקות",
                    "בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי שהדברים קשים לי מדי",
                    "כן, לרוב לא יכולתי להתמודד בכלל",
                    "כן, לפעמים לא יכולתי להתמודד כפי שאני רגילה",
                    "לא, בדרך כלל התמודדתי (הסתדרתי) די טוב",
                    " לא, אני מתמודדת כמו תמיד"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי כה אומללה, שהיה לי קשה לישון",
                    "כן, בדרך כלל",
                    "כן, לפעמים",
                    "לעתים רחוקות",
                    "בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי עצובה או אומללה (מצוברחת)",
                    "כן, רוב הזמן",
                    "כן, לעיתים קרובות",
                    "לעתים רחוקות",
                    "בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, הרגשתי כה אומללה, שבכיתי",
                    "רוב הזמן",
                    "לעתים קרובות",
                    "רק מדי פעם",
                    "בכלל לא"),

            new QuizViewModel("במשך השבוע האחרון, המחשבה לפגוע בעצמי עלתה בראשי",
                    "כן, לעתים קרובות",
                    "לפעמים",
                    "כמעט לא",
                    "בכלל לא")
    };

    private int count = 0;
    private int sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        question = findViewById(R.id.question);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        next = findViewById(R.id.next);
        updateQuestion(questions[0]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count < question.length()-2) {
                    updateQuestion(questions[count]);
                    if (radio1.isChecked())
                        sum += 3;
                    if (radio1.isChecked())
                        sum += 2;
                    if (radio1.isChecked())
                        sum += 1;
                    if (radio1.isChecked())
                        sum += 0;
                }
                else if (count==10){

                    Button mButtonForum = (Button) findViewById(R.id.next);
                    mButtonForum.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(getApplicationContext(), finishActivity.class);
                            startActivity(i);
                        }
                    });
                }


                count++;
            }
        });

    }

    private void updateQuestion(QuizViewModel question) {
        this.question.setText(question.getQuestion());
        radio1.setText(question.getRadio1());
        radio2.setText(question.getRadio2());
        radio3.setText(question.getRadio3());
        radio4.setText(question.getRadio4());
    }
}

