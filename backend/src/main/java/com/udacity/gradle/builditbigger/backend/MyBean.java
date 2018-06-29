package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myJoke;

    public String getData() {
        return myJoke;
    }

    public void setMyJoke(String data) {
        myJoke = data;
    }
}