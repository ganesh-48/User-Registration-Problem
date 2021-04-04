package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    UserRegistrationDetails userRegistrationDetails  = new UserRegistrationDetails();

    @Test
    public void giveFirstName_whereProper_shouldReturnTrue() {
        boolean result = userRegistrationDetails.registerFirstName("Sujit");
        Assert.assertEquals(result,true);
    }
}
