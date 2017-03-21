package org.launchcode.java.multiple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        questions.add(new TrueFalseQuestion("Is the sky blue?", true));
        questions.add(new MultipleChoiceQuestion("What is the best type of pizza?", new ArrayList<Answer>(Arrays.asList(new Answer("Pepperoni", true), new Answer("Cheese", false), new Answer("Sausage", false)))));

        loop(questions, reader);
    }

    private static void loop(List<Question> questions, Scanner reader) {
        for(Question q : questions) {
            System.out.println(q.draw());
            int selection = reader.nextInt();
            if(q.score(selection)) {
                System.out.println("Congrats!!! You got it!");
            } else {
                System.out.println("Ooops! That wasn't quite right!");
            }
        }
    }
}
