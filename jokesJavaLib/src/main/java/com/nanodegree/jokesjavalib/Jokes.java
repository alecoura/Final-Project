package com.nanodegree.jokesjavalib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Jokes {

    List<String> list = asList(
            "What’s the best thing about Switzerland? I don’t know, but the flag is a big plus.",
            "Helvetica and Times New Roman walk into a bar. - Get out of here! shouts the bartender. " +
                    "- We don’t serve your type.",
            "A woman in labor suddenly shouted, - Shouldn’t! Wouldn’t! Couldn’t! Didn’t! Can’t!" +
                    "- Don’t worry, said the doc. - Those are just contractions.",
            "Did you hear about the claustrophobic astronaut? He just needed a little space.",
            "Why can’t you explain puns to kleptomaniacs? They always take things literally.",
            "Why don’t Calculus majors throw house parties? Because you should never drink and derive."
    );

    public String getJoke(){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}