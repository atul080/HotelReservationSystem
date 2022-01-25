package com.hrs;

import java.util.ArrayList;
import java.util.HashMap;

public class HRSHotelOperations {
    public static boolean addHotel(String hotelName,int rate) throws HotelAdditionException {

            //creating a new hash map to store hotel data.
            HashMap<String, Integer> hotels = new HashMap<String, Integer>();
            if (hotelName!=null)
             hotels.put(hotelName, rate);
            else
                throw new HotelAdditionException("Hotel not added");
            if (hotels.containsKey(hotelName))
                return true;
            else
                return false;

    }
}
