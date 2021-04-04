package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationDetails {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;

    /*Checking the first name of user is valid or invalid
     *First name start with Upper case character
     */
    public String getFirstName(){
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        return firstName;
    }

    public String getLastName(){
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        return lastName;
    }

    public boolean registerFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(firstName);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your first name is valid");
        } else {
            System.out.println("Your first name is invalid");
        }
        return matches;
    }

    public boolean registerLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-z]{1}[a-z]{2}+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(lastName);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your last name is valid");
        } else {
            System.out.println("Your last name is invalid");
        }
        return matches;
    }
    public static void main(String[] args){
        System.out.println("Welcome to user registration problem ");
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        String firstName = userRegistrationDetails.getFirstName();
        userRegistrationDetails.registerFirstName(firstName);
        String lastName = userRegistrationDetails.getLastName();
        userRegistrationDetails.registerLastName(lastName);
    }

}
