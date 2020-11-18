package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] answer = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        for (int i = 0; i < answer.length; i++) {
            Boolean ans1 = reader.readLine().equals(answer[i]);

            if (ans1) {
                writer.write(good);
            } else {
                writer.write(bad);
            }
        }

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"




        // allow user to read our response
        reader.readLine();
    }
}
