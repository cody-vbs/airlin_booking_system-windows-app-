import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

 class ProgressBarReceipt extends JPanel {

    private JProgressBar bar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 50);
    private JLabel label = new JLabel("", JLabel.CENTER);
    private Timer timer = new Timer(50, new ActionListener() {

        private int counter = 1;

        @Override
        public void actionPerformed(ActionEvent ae) {
            String outPut = "Printing in progress";
            label.setText( outPut);
            bar.setValue(++counter);
            if (counter > 50) {
                timer.stop();
                JOptionPane.showMessageDialog(null,"Done");
//                new GetPanel().getMyPanel().setVisible(true);
                
               
            }
        }
    });

    ProgressBarReceipt() {
        super.setLayout(new GridLayout(0, 1));
        bar.setValue(0);
        timer.start();
        this.add(bar);
        this.add(label);
        JOptionPane.showMessageDialog(null, this, "Please Wait", JOptionPane.PLAIN_MESSAGE);
       
        
    }

   
}