
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syd
 */
public class GetPanel {
    static JPanel myPanel;

    public static JPanel getMyPanel() {
        return myPanel;
    }

    public static void setMyPanel(JPanel myPanel) {
        GetPanel.myPanel = myPanel;
    }
    
    
}
