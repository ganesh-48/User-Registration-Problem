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

    public boolean registerFirstName(String firstName) throws  UserInvalidRegistrationDetailsException{
        try {
            checkInputIsEmpty(firstName);
            checkNameIsInDigits(firstName);
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(firstName);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_NULL, "Please enter a valid input");
        }
    }

    /*@description:- if name is in digits then throw a custom exception
     * @param:-first name or last name given by user */
    private void checkNameIsInDigits(String firstName) throws UserInvalidRegistrationDetailsException {
        if (firstName.matches("[0-9]+")) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_DIGITS, "Please enter alphabets");
        }
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
        Pattern pattern = Pattern.compile("[A-z]{1}[a-z]{2}+");
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

    public boolean registerEmail(String email) throws UserInvalidRegistrationDetailsException {
        try {
            checkInputIsEmpty(email);
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_NULL, "Please enter a valid email");
            }
    }

    //Check the mobile number predefined format
    public String getMobileNumber(){
        System.out.println("Enter your mobile number:");
        String mobileNumber = scanner.nextLine();
        return mobileNumber;
    }

    public boolean registerMobileNumber(String mobileNumber) throws UserInvalidRegistrationDetailsException {
        try {
            checkInputIsEmpty(mobileNumber);
            checkMobileNumberIsInLetters(mobileNumber);
            Pattern pattern = Pattern.compile("((\\+)?(\\d{2}[-]))?((\\d{10}){1})",
                Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(mobileNumber);
            boolean matches =  matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_NULL, "Please enter a valid mobile number");
        }
    }

    private void checkMobileNumberIsInLetters(String mobileNumber) throws UserInvalidRegistrationDetailsException {
        if (mobileNumber.matches("[A-Za-z]+")) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_LETTERS, "Please enter digits");
        }
    }

    /*check the password is valid or invalid
    *The password should be minimum 8 characters or more
    * In password at least one upper case letter
    * In password at least one numeric number
    * in password add Exactly one special character
     */
    public String getPassword(){
        System.out.println("Enter your password:");
        String password = scanner.next();
        return password;
    }

    public boolean registerPassword(String password) throws UserInvalidRegistrationDetailsException {
        try {
            checkInputIsEmpty(password);
            Pattern pattern = Pattern.compile("(?=.*[A-Z])[0-9a-z$%&*@!#]{8,}$",
                Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(password);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_NULL, "Please enter a valid password");
        }
    }

    /*@Description:- It checks if the input given by user is empty or not if empty then throw custom exception
     * @param:-input given by user as name,email,password or mobile number*/
    private void checkInputIsEmpty(String input ) throws UserInvalidRegistrationDetailsException {
        if (input.length() == 0) {
            throw new UserInvalidRegistrationDetailsException(
                    UserInvalidRegistrationDetailsException.ExceptionType.ENTERED_EMPTY, "Please give some input");
        }
    }
}
