package org.launchcode.java.multiple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by stephen on 3/20/17.
 */
public class Question {

    private String value;
    private List<Answer> answers;

    public Question(String value, List<Answer> answers) {
        this(value);
        this.answers = answers;
    }

    public Question(String value) {
        this.value = value;
        this.answers = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addAnswer(Answer answer) {
        if(!this.answers.contains(answer)) {
            this.answers.add(answer);
        }
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }

    public String draw() {
        return this.getValue();
    }

    public boolean score(int selection) {
        return false;
    }
}
