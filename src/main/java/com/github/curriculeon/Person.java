package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Person {
    private String fName;
    private String lName;

    public Person(){
        this.fName = "";
        this.lName = "";
    }

    public Person(String firstName, String lastName) {
        this.fName = firstName;
        this.lName = lastName;
    }

    public String getFirstName() {

        return fName;
    }

    public void setFirstName(String firstName) {
        this.fName = firstName;
    }

    public String getLastName() {

        return lName;
    }

    public void setLastName(String lastName) {
        this.lName = lastName;
    }
}
