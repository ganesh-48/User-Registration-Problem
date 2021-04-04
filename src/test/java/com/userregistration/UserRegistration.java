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
}
