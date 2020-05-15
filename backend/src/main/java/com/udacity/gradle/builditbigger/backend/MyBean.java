package com.udacity.gradle.builditbigger.backend;

import static com.example.jokeslibrary.JokesClass.getJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String getData() {
        return getJoke();
    }

}