package com.userregistration;

import com.userregistration.UserInvalidRegistrationDetailsException;
import com.userregistration.UserRegistrationDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistration {
    UserRegistrationDetails userRegistrationDetails  = new UserRegistrationDetails();

    @Test
    public void giveFirstName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerFirstName("Sam");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_LengthShort_ShouldReturnFalse() {
        boolean result = userRegistrationDetails.registerFirstName("Sa");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveLastName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerLastName("Sharma");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_LengthShort_shouldReturnFalse() {
        boolean result = userRegistrationDetails.registerLastName("Sh");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveEmail_whereProper_ShouldReturnTrue() {
        boolean result = userRegistrationDetails.registerEmail("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveEmail_Le() {
    }

    @Test
    public void giveMobileNumber_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerMobileNumber("+91-1234568798");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerPassword("abhay12@");
        Assert.assertEquals(true, result);
    }
}
