package com.hrs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void hotelAdding_ifSuccessful_shouldReturnTrue() throws HotelAdditionException {
        boolean checkLakewood=HRSHotelOperations.addHotel("Lakewood",110);
        boolean checkBridgewood=HRSHotelOperations.addHotel("Brdgewood",160);
        boolean checkRidgewood=HRSHotelOperations.addHotel("Ridgewood",110);
        Assertions.assertTrue(checkLakewood);
        Assertions.assertTrue(checkBridgewood);
        Assertions.assertTrue(checkRidgewood);
    }
    @Test
    public void hotelAdding_ifNotSuccessful_shouldThrowException() throws HotelAdditionException {
        boolean check=HRSHotelOperations.addHotel(null,110);
        Assertions.assertFalse(check);
    }
}
