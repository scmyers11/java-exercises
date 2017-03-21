package org.launchcode.java.multiple;

import java.util.List;

/**
 * Created by stephen on 3/20/17.
 */
public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String value, List<Answer> answers) {
        super(value, answers);
    }

    @Override
    public String draw() {
        String result = this.getValue() + "\n";
        for(int i = 0; i < this.getAnswers().size(); i++) {
            result += ((i+1) + ": " + this.getAnswers().get(i).getValue() + "\n");
        }
        return result;
    }

    @Override
    public boolean score(int selection) {
        if(selection - 1 < this.getAnswers().size()) {
            return this.getAnswers().get(selection - 1).isCorrect();
        }
        return false;
    }
}
