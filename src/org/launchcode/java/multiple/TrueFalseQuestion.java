package org.launchcode.java.multiple;

/**
 * Created by stephen on 3/20/17.
 */
public class TrueFalseQuestion extends Question {

    private Answer trueAnswer;
    private Answer falseAnswer;

    public TrueFalseQuestion(String value, boolean isTrue) {
        super(value);
        this.trueAnswer = new Answer("True", isTrue);
        this.falseAnswer = new Answer("False", !isTrue);
    }

    @Override
    public String draw() {
        return this.getValue() + "\nTrue: 1\nFalse: 0";
    }

    @Override
    public boolean score(int selection) {
        if(selection == 1) {
            return this.trueAnswer.isCorrect();
        } else {
            return this.falseAnswer.isCorrect();
        }
    }

}
