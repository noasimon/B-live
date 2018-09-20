package com.example.android.b_lieve;

public class QuizViewModel {
    private String question;
    private String radio1;
    private String radio2;
    private String radio3;
    private String radio4;

    public String getQuestion() {
        return question;
    }

    public String getRadio1() {
        return radio1;
    }

    public String getRadio2() {
        return radio2;
    }

    public String getRadio3() {
        return radio3;
    }

    public String getRadio4() {
        return radio4;
    }

    public QuizViewModel(String question, String radio1, String radio2, String radio3, String radio4) {
        this.question = question;
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
        this.radio4 = radio4;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setRadio1(String radio1) {
        this.radio1 = radio1;
    }

    public void setRadio2(String radio2) {
        this.radio2 = radio2;
    }

    public void setRadio3(String radio3) {
        this.radio3 = radio3;
    }

    public void setRadio4(String radio4) {
        this.radio4 = radio4;
    }
}
