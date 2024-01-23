package pharmacyagain;
import java.awt.Color;
import javax.swing.JFrame;
public class Pharmacyagain
{
    public static void main(String[] args)
    {
        frontframe ff=new frontframe();
        ff.setTitle("BEST CASE PHARMACY");
        ff.setSize(600,500);
        ff.initialize();
        ff.setLocationByPlatform(true);
        ff.getContentPane().setBackground(Color.getColor("White", 100));
        ff.setLayout(null);
        ff.setVisible(true);
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
          }
}