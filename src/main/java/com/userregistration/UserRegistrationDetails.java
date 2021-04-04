package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationDetails {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    public static void main(String[] args){
        System.out.println("Welcome to user registration problem ");
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        String firstName = userRegistrationDetails.getFirstName();
        userRegistrationDetails.registerFirstName(firstName);
    }

    /*Checking the first name of user is valid or invalid
    *First name start with Upper case character
    */
    public String getFirstName(){
        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();
        return firstName;
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
}
