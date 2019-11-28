import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

 class ProgressBar extends JPanel {

    private JProgressBar bar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 20);
    private JLabel label = new JLabel("", JLabel.CENTER);
    private Timer timer = new Timer(20, new ActionListener() {

        private int counter = 1;

        @Override
        public void actionPerformed(ActionEvent ae) {
            String outPut = "Loading data";
            label.setText( outPut);
            bar.setValue(++counter);
            if (counter > 20) {
                timer.stop();
                JOptionPane.showMessageDialog(null,"Process is completed");
//                new GetPanel().getMyPanel().setVisible(true);
                
               
            }
        }
    });

    ProgressBar() {
        super.setLayout(new GridLayout(0, 1));
        bar.setValue(0);
        timer.start();
        this.add(bar);
        this.add(label);
        JOptionPane.showMessageDialog(null, this, "Please Wait", JOptionPane.PLAIN_MESSAGE);
       
        
    }

   
}