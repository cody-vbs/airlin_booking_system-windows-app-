
import java.sql.*;
import javax.swing.*;
public class SplashClass 
{
    public static void main(String[] args) 
    {
        int i;
         SplashScreen sp = new SplashScreen();
         sp.setVisible(true);
        
         
         try
         {
             for( i=0;i<=200;i++)
             {
                 Thread.sleep(30);
                
                 sp.progress.setValue(i);
                 
             }
             if(i==201)
             {
                  LoginForm lf = new LoginForm();
                  lf.setVisible(true);
                  sp.setVisible(false);
               
             }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
         
    }
}
