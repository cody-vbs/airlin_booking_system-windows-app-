
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syd
 */
public class Cash extends javax.swing.JFrame {

    /**
     * Creates new form CreditCard
     */
    GetBookDetails gd = new GetBookDetails();
    Image plane;
    
    public Cash() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#a3f7bf"));
        this.myBookFlight();
        pnrField.setText(new GetBookDetails().getMyPnr());
        pnrField.setEditable(false);
        totalField.setText(new GetBookDetails().getPrice());
        totalField.setEditable(false);
        this.setJframeIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void myBookFlight(){
        
        String imgDir = "C:\\Users\\syd\\Documents\\NetBeansProjects\\Airline Booking System"
                + "\\airlin_booking_system-windows-app-\\src\\Icons\\airplane.png";
        ImageIcon airplane1 = new ImageIcon(imgDir);
        
        
        bookArea.setText(gd.getBookText());
        fromLabel.setText(gd.getFrom());
        toLabel.setText(gd.getTo());
        totalLabel.setText(gd.getPrice());
        fromNameLabel.setText(gd.getFromName());
        toNameLabel.setText(gd.getToName());
        
        
        if(gd.getStr1().equals("CEB") && gd.getStr2().equals("ICN")){
            fromLabel.setText(gd.getFrom());
            toLabel.setText(gd.getTo());
            connectFromLabel.setText(gd.getConnectFrom());
            connectToLabel.setText(gd.getConnectTo());
            fromNameLabel.setText(gd.getFromName());
            toNameLabel.setText(gd.getToName());
            connectFromNameLabel.setText(gd.getConnectFromName());
            connectToNameLabel.setText(gd.getConnectToName());
            airplaneLabel2.setIcon(airplane1);
            
            System.out.println(gd.getConnectFrom());
            System.out.println(gd.getConnectTo());
        }else if(gd.getStr1().equals("CEB") && gd.getStr2().equals("SIN")){
             fromLabel.setText(gd.getFrom());
            toLabel.setText(gd.getTo());
            connectFromLabel.setText(gd.getConnectFrom());
            connectToLabel.setText(gd.getConnectTo());
            fromNameLabel.setText(gd.getFromName());
            toNameLabel.setText(gd.getToName());
            connectFromNameLabel.setText(gd.getConnectFromName());
            connectToNameLabel.setText(gd.getConnectToName());
            airplaneLabel2.setIcon(airplane1);
        }else if(gd.getStr1().equals("HND") && gd.getStr2().equals("CEB")){
            fromLabel.setText(gd.getFrom());
            toLabel.setText(gd.getTo());
            connectFromLabel.setText(gd.getConnectFrom());
            connectToLabel.setText(gd.getConnectTo());
            fromNameLabel.setText(gd.getFromName());
            toNameLabel.setText(gd.getToName());
            connectFromNameLabel.setText(gd.getConnectFromName());
            connectToNameLabel.setText(gd.getConnectToName());
            airplaneLabel2.setIcon(airplane1);
        }
        
        //set icon
        
        
        airplaneLabel1.setIcon(airplane1);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        connectFromLabel = new javax.swing.JLabel();
        connectFromNameLabel = new javax.swing.JLabel();
        airplaneLabel1 = new javax.swing.JLabel();
        fromNameLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        toNameLabel = new javax.swing.JLabel();
        connectToLabel = new javax.swing.JLabel();
        airplaneLabel2 = new javax.swing.JLabel();
        connectToNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        qrField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnrField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Booking Total");

        totalLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("jLabel5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Booking Summary");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fromLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Departure");

        connectFromLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        connectFromNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        connectFromNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        airplaneLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fromNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fromNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        toLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        toNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        toNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        connectToLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        airplaneLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        connectToNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        connectToNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bookArea.setEditable(false);
        bookArea.setColumns(20);
        bookArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        bookArea.setRows(5);
        bookArea.setBorder(null);
        jScrollPane2.setViewportView(bookArea);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Got a Promo Code?");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/barcode_ scan.png"))); // NOI18N
        jButton2.setText("Scan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(fromLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(airplaneLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(connectFromLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(airplaneLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromNameLabel)
                                    .addComponent(connectFromNameLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(connectToLabel)
                            .addComponent(toLabel)
                            .addComponent(toNameLabel)
                            .addComponent(connectToNameLabel))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(qrField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jLabel10))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qrField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(airplaneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromNameLabel)
                    .addComponent(toNameLabel))
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(connectFromLabel)
                    .addComponent(connectToLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(airplaneLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectFromNameLabel)
                    .addComponent(connectToNameLabel))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(163, 247, 191));
        jButton1.setText("Pay Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(41, 161, 156));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("PNR Number");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Amount to be Paid");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Enter your amount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnrField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnrField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new WebcamQRCodeScanner().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //format total val
        String formatTotal ="";
        String newTotal = "";
        if(totalField.getText().contains("PHP")){
            newTotal = totalField.getText().replace("PHP", "");
        }else if(totalField.getText().contains("Php")){
             formatTotal = totalField.getText().replaceAll("Php", "");
             newTotal = formatTotal.replaceAll("\\s","");
        }
       
        
        //computer for change
        Double total = Double.parseDouble(newTotal);
        Double yourAmount = Double.parseDouble(amountField.getText());
        
        Double change = yourAmount-total;
        
        String strChange = Double.toString(change);
        
        System.out.println(strChange);
        
        String fname = JOptionPane.showInputDialog("Enter reciept name");
        fname+=".pdf";
        new ProgressBarPayment().setVisible(true);
          Document document = new Document();
            PdfWriter writer;
            
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream(fname));
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
            document.open();
            
        if(gd.getStr1().equals("CEB") && gd.getStr2().equals("ICN")){
           
                try {
                   document.add(new Paragraph("FLIGHT SUMARRY" +"\n\n"));
               } catch (DocumentException ex) {
                   Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
               }

                try {
                document.add(new Paragraph(gd.getFromName() +"(" + gd.getFrom()+")" +" To " + gd.getToName() +" (" +gd.getTo() +")" +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph(gd.getConnectFromName() +" (" +gd.getConnectFrom()+") " +" To " +gd.getConnectToName() +"( " +
                            gd.getConnectTo() + ") "));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    document.add(new Paragraph(bookArea.getText() +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Booking Total: " + totalLabel.getText() +"\n\n\n\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Amount Paid: " + amountField.getText() +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Amount Changed: " + Double.toString(change)));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }


                document.close();

            
            
            
            
           
        }else if(gd.getStr1().equals("CEB") && gd.getStr2().equals("SIN")){
                try {
                 document.add(new Paragraph("FLIGHT SUMARRY" +"\n\n"));
               } catch (DocumentException ex) {
                   Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
               }

                try {
                document.add(new Paragraph(gd.getFromName() +"(" + gd.getFrom()+")" +" To " + gd.getToName() +" (" +gd.getTo() +")" +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph(gd.getConnectFromName() +" (" +gd.getConnectFrom()+") " +" To " +gd.getConnectToName() +"( " +
                            gd.getConnectTo() + ") "));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    document.add(new Paragraph(bookArea.getText() +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Booking Total: " + totalLabel.getText() +"\n\n\n\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Amount Paid: " + amountField.getText() +"\n"));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    document.add(new Paragraph("Amount Changed: " + Double.toString(change)));
                } catch (DocumentException ex) {
                    Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                }


                document.close();    

        }else if(gd.getStr1().equals("HND") && gd.getStr2().equals("CEB")){
                try {
                  document.add(new Paragraph("FLIGHT SUMARRY" +"\n\n"));
                  } catch (DocumentException ex) {
                      Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                  }

                   try {
                   document.add(new Paragraph(gd.getFromName() +"(" + gd.getFrom()+")" +" To " + gd.getToName() +" (" +gd.getTo() +")" +"\n"));
                   } catch (DocumentException ex) {
                       Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   try {
                       document.add(new Paragraph(gd.getConnectFromName() +" (" +gd.getConnectFrom()+") " +" To " +gd.getConnectToName() +"( " +
                               gd.getConnectTo() + ") "));
                   } catch (DocumentException ex) {
                       Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                   }

                   try {
                       document.add(new Paragraph(bookArea.getText() +"\n"));
                   } catch (DocumentException ex) {
                       Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   try {
                       document.add(new Paragraph("Booking Total: " + totalLabel.getText() +"\n\n\n\n"));
                   } catch (DocumentException ex) {
                       Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   try {
                       document.add(new Paragraph("Amount Paid: " + amountField.getText() +"\n"));
                   } catch (DocumentException ex) {
                       Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   try {
                       document.add(new Paragraph("Amount Changed: " + Double.toString(change)));
                   } catch (DocumentException ex) {
                       Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
                   }


                   document.close();
        }else
       
            
            
            
            
            
            
            
            
        try {
            document.add(new Paragraph("FLIGHT SUMARRY" +"\n\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        try {
            document.add(new Paragraph(gd.getFromName() +"(" + gd.getFrom()+")" +" To " + gd.getToName() +" (" +gd.getTo() +")" +"\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            document.add(new Paragraph(bookArea.getText() +"\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.add(new Paragraph("Booking Total: " + totalLabel.getText() +"\n\n\n\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.add(new Paragraph("Amount Paid: " + amountField.getText() +"\n"));
        } catch (DocumentException ex) {
            Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            document.add(new Paragraph("Amount Changed: " + Double.toString(change)));
        } catch (DocumentException ex) {
            Logger.getLogger(Cash.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        document.close();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
     public void setJframeIcon(){
        String iconDir = "src\\Icons\\logo.png";
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(iconDir);
        this.setIconImage(icon);
        this.setTitle("Airline Booking System");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplaneLabel1;
    private javax.swing.JLabel airplaneLabel2;
    private javax.swing.JTextField amountField;
    private javax.swing.JTextArea bookArea;
    private javax.swing.JLabel connectFromLabel;
    private javax.swing.JLabel connectFromNameLabel;
    private javax.swing.JLabel connectToLabel;
    private javax.swing.JLabel connectToNameLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel fromNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pnrField;
    private javax.swing.JTextField qrField;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel toNameLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
