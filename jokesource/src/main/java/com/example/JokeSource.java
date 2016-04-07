package com.example;

import java.util.Random;

public class JokeSource {


    public String getJoke(){

        Random rn = new Random();
        int num = rn.nextInt(2);
        String [] jokes  = {
                " Q: What do you call a basement full of blondes?\n A: A whine cellar.\n"
                 ,
                " Q: How do you know a blonde likes you?\nA: She sees you.\n"
                ,
                " Q: What does a blonde say if you blow in her ear?\nThanks for the refill!"};
        return (jokes[num]);


    }
}
