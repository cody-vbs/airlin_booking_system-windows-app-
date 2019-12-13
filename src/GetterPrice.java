/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syd
 */
public class GetterPrice {
    static String airportName;
    static String guestName;

    public static String getGuestName() {
        return guestName;
    }

    public static void setGuestName(String guestName) {
        GetterPrice.guestName = guestName;
    }

    public static String getAirportName() {
        return airportName;
    }

    public static void setAirportName(String airportName) {
        GetterPrice.airportName = airportName;
    }
    
}
