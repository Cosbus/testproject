package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mQuestionAnswered;
    private boolean mUserAnsweredCorrectly;

    public Question(int textResId, boolean answerTrue, boolean questionAnswered){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mQuestionAnswered = questionAnswered;
        mUserAnsweredCorrectly = false;
        }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setQuestionAnswered(boolean questionAnswered){
        mQuestionAnswered = questionAnswered;
    }

    public void userAnsweredCorrectly(){
        mUserAnsweredCorrectly = true;
    }

    public boolean didUserAnswerCorrectly(){
        return mUserAnsweredCorrectly;
    }

    public boolean isQuestionAnswered(){
        return mQuestionAnswered;
    }
}
