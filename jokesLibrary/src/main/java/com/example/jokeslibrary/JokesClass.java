package com.example.jokeslibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesClass {

    public static String getJoke(){

        Random rand = new Random();
        int random = rand.nextInt(5);

        List<String> jokeList = new ArrayList<String>();
        jokeList.add("What did Cinderella say when her photos didn't arrive on time?What did Cinderella say when her photos didn't arrive on time?\n" +
                "\n" + "One day my prints will come!One day my prints will come!");
        jokeList.add("Why do we tell actors to \"break a leg?\"\n" +
                "Because every play has a cast. ");
        jokeList.add("What kind of bagel can fly?" + "\n" + "A plain bagel");
        jokeList.add("I used to think I was indecisive...I used to think I was indecisive...\n" +
                "\n" +  "But now I'm not sure!But now I'm not sure!");
        jokeList.add("Why does the Yeti know all the map symbols?Why does the Yeti know all the map symbols?\n" +
                "\n" + "Because it's a legend!Because it's a legend!");

        return jokeList.get(random);
    }

}
