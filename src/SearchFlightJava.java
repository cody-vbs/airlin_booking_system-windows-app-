
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syd
 */
public class SearchFlightJava {
    static JComboBox fromFlight;
    static JComboBox toFlight;

    public static JComboBox getFromFlight() {
        return fromFlight;
    }

    public static void setFromFlight(JComboBox fromFlight) {
        SearchFlightJava.fromFlight = fromFlight;
    }

    public static JComboBox getToFlight() {
        return toFlight;
    }

    public static void setToFlight(JComboBox toFlight) {
        SearchFlightJava.toFlight = toFlight;
    }
    
    
    
}
