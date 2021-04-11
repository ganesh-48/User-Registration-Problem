package com.userregistration;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistration {
    UserRegistrationDetails userRegistrationDetails  = new UserRegistrationDetails();

    @Test
    public void giveFirstName_whereProper_shouldReturnTrue() {
        try {
            boolean result = userRegistrationDetails.registerFirstName("Sam");
            Assertions.assertEquals(true, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void giveFirstName_LengthShort_ShouldReturnFalse() {
        try {
            boolean result = userRegistrationDetails.registerFirstName("Sa");
            Assertions.assertEquals(false, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void giveLastName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerLastName("Sharma");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void giveLastName_LengthShort_shouldReturnFalse() {
        boolean result = userRegistrationDetails.registerLastName("Sh");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void giveEmail_whereProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistrationDetails.registerEmail("abc@gmail.com");
            Assertions.assertEquals(true, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void givenEmail_LengthShort_ShouldReturnFalse() {
        try {
            boolean result = userRegistrationDetails.registerEmail("abc.@gmail.com");
            Assertions.assertEquals(false, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void giveMobileNumber_whereProper_shouldReturnTrue() {
        try {
            boolean result = userRegistrationDetails.registerMobileNumber("+91-1234568798");
            Assertions.assertEquals(true, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void giveMobileNumber_LengthShort_ShouldReturnFalse() {
        try {
            boolean result = userRegistrationDetails.registerMobileNumber("+91 1234567");
            Assertions.assertEquals(false, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

    @Test
    public void givenPassword_whereProper_shouldReturnTrue() {
        try {
            boolean result = userRegistrationDetails.registerPassword("abhay12@");
            Assertions.assertEquals(true, result);
        } catch (UserInvalidRegistrationDetailsException e) {

        }
    }

}
