package com.userregistration;


import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class EmailValidationTest {
    private String email;
    private boolean expectedResult;
    private UserRegistrationDetails registerdEmail;

    public EmailValidationTest(boolean expected, String email) {
        super();
        this.email = email;
        this.expectedResult = expected;
    }


    @Before
    public void initialize() {
        registerdEmail = new UserRegistrationDetails();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]
                {
                        {true, "abc@yahoo.com"},
                        {true, "abc-100@yahoo.com"},
                        {true, "abc.100@yahoo.com"},
                        {true, "abc111@abc.com"},
                        {true, "abc-100@abc.net"},
                        {true, "abc.100@abc.com.au"},
                        {true, "abc@1.com"},
                        {true, "abc@gmail.com.com"},
                        {true, "abc+100@gmail.com"},
                        {false, "abcgmail.com"},
                        {false, "abc@.com.my"},
                        {false, "abc.100@gmail.a"},
                        {false, "abc123@.com"},
                        {false, "abc123@.com.com"},
                        {false, ".abc@abc.com"},
                        {false, "abc()*@abc.com"},
                        {false, "abc@%*.com"},
                        {false, "abc..2002@gmail.com"},
                        {false, "abc.@gamil.com"},
                        {false, "abc@abc@gmail.com"},
                        {false, "abc@gmail.com.1a"},
                        {false, "abc@gmail.com.aa.au"},
                });
    }

    @Test
    public void testEmailValidation() {
        try {
            System.out.println("expected result for email is " + expectedResult);
            Assertions.assertEquals(expectedResult, registerdEmail.registerEmail(email));
        } catch (UserInvalidRegistrationDetailsException e) {
            e.printStackTrace();
        }
    }
}
