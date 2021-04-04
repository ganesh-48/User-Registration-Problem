package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationDetails {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;

    /*Checking the first name of user is valid or invalid
     *First name start with Upper case character
     */
    public String getFirstName(){
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
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

    /*Checking the Last name of user is valid or invalid
     *Last name start with Upper case character
     */
    public String getLastName(){
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        return lastName;
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

    //Checking the Email  is valid or invalid
    public String getEmail(){
        System.out.println("Enter your Email:");
        String email = scanner.nextLine();
        return email;
    }

    public boolean registerEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matches = matcher.find();
        if(matches) {
            System.out.println("Your Email is valid");
        } else {
            System.out.println("Your Email is invalid");
        }
        return matches;
    }

    //Check the mobile number predefined format
    public String getMobileNumber(){
        System.out.println("Enter your mobile number:");
        String mobileNumber = scanner.nextLine();
        return mobileNumber;
    }

    public boolean registerMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("((\\+)?(\\d{2}[-]))?((\\d{10}){1})",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matches =  matcher.find();
        if(matches){
            System.out.println("Your mobile number is valid");
        } else {
            System.out.println("Your mobile number is invalid");
        }
        return matches;
    }

    /*check the password is valid or invalid
    *The password should be minimum 8 characters or more
    * In password at least one upper case letter
    * In password at least one numeric number
     */
    public String getPassword(){
        System.out.println("Enter your password:");
        String password = scanner.next();
        return password;
    }

    public boolean registerPassword(String password) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])[0-9a-z$%&*@!#]{8,}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Your password is valid");
        } else {
            System.out.println("Your password is invalid");
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
        String email = userRegistrationDetails.getEmail();
        userRegistrationDetails.registerEmail(email);
        String mobileNumber = userRegistrationDetails.getMobileNumber();
        userRegistrationDetails.registerMobileNumber(mobileNumber);
        String password = userRegistrationDetails.getPassword();
        userRegistrationDetails.registerPassword(password);
    }
}
