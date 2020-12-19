package com.mateo9x.tests;

import com.mateo9x.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneTests {

    @Test
    public void isTrue()
    {

        //given
        Phone phone = new Phone("Xiaomi", "Redmi");

        //when
        String isBrandTrue  = phone.getBrand();
        String isPhoneFilledCorrect = phone.getBrand() + " " + phone.getModel();

        //then

        Assertions.assertEquals("Xiaomi",isBrandTrue);
        Assertions.assertEquals("Xiaomi Redmi",isPhoneFilledCorrect);

    }

    @Test
    public void isFalse()
    {
        //given
        Phone phone = new Phone("HTC", "Desire One");

        //when
        String isModelFalse = phone.getModel();

        //then
        Assertions.assertNotEquals("11",isModelFalse);


    }

}
