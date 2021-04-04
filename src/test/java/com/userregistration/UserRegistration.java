package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    UserRegistrationDetails userRegistrationDetails  = new UserRegistrationDetails();

    @Test
    public void giveFirstName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerFirstName("Sam");
        Assert.assertEquals(result,true);
    }

    @Test
    public void giveLastName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerLastName("Sharma");
        Assert.assertEquals(result,true);
    }

    @Test
    public void giveEmail_whereProper_ShouldReturnTrue() {
        boolean result = userRegistrationDetails.registerEmail("abc@gmail.com");
        Assert.assertEquals(result,true);
    }

    @Test
    public void giveMobileNumber_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerMobileNumber("+91-1234568798");
        Assert.assertEquals(result,true);
    }

    @Test
    public void givenPassword_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerPassword("abhay12@");
        Assert.assertEquals(result,true);
    }
}
