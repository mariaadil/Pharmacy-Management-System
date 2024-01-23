package pharmacyagain;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class medicineselection extends JFrame implements ActionListener
{
    public JLabel jl = new JLabel();
    public JLabel N = new JLabel();
    public JLabel P = new JLabel();
    public JTextArea D = new JTextArea();
    public JButton b = new JButton();
    public static JCheckBox[] s = new JCheckBox[19];
    public JLabel[] p = new JLabel[21];
    public JTextArea[] dm = new JTextArea[19];
    public String[] Name = new String[19];
    public String[] Quantity = new String[21];
    public String[] Price = new String[21];
    public String[] DateOFM = new String[21];
    public String[] DateOFE = new String[21];
    Font f = new Font("Times New Roman", Font.BOLD, 18);
    Font f3 = new Font("Times New Roman", Font.PLAIN, 14);
    
    public void medicineselection()
    { 
        try 
        {                                                                               
            File f = new File("C:\\Users\\Fattani Computers\\Desktop\\medicineselection.txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext())
            {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                Name[i] = arr[0];
                Price[i] = arr[1];
                i++;
            }
            input.close();
        }
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }

        jl.setText("SELECT MEDICINE");
        jl.setBounds(5, 10, 400, 40);
        jl.setForeground(Color.WHITE);
        jl.setFont(f);
        this.add(jl);
        
        N = new JLabel("Name");
        N.setBounds(10, 50 , 250, 20);
        N.setBackground(Color.black);
        N.setForeground(Color.white);
        N.setFont(f3);
        this.add(N);

        P = new JLabel("Price");
        P.setBounds(350, 50 , 100,20);
        P.setBackground(Color.black);
        P.setForeground(Color.white);
        P.setFont(f3);
        this.add(P);
        
        D .setText("Quantity");
        D.setBounds(450, 50 , 50,20);
        D.setBackground(Color.black);
        D.setForeground(Color.white);
        D.setFont(f3);
        this.add(D);

        for (int i = 0; i < 10; i++)
        {
            s[i] = new JCheckBox(Name[i], false);
            s[i].setBounds(10, 100 + (i * 18), 250, 20);
            s[i].setFont(f3);
            this.add(s[i]);

            p[i] = new JLabel(Price[i]);
            p[i].setBounds(350, 100 + (i * 18), 100, 20);
            p[i].setForeground(Color.WHITE);
            p[i].setFont(f3);
            this.add(p[i]);

            dm[i] = new JTextArea(Quantity[i]);
            dm[i].setBounds(450, 100 + (i * 18), 50, 20);
            dm[i].setFont(f3);
            this.add(dm[i]);
        }  
        
        b.setText("CONFIRM");
        b.setBounds(550, 550, 100, 30);
        b.setFont(f3);
        b.addActionListener(this);
        this.add(b);
        }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String op = ae.getActionCommand();    
      int i=0;
      
            if(op.compareTo("CONFIRM") == 0)
        {
              if(s[i++].isSelected())
        {
            billing bl = new billing();
            bl.setTitle("BEST CASE MEDICINE");
            bl.setSize(400, 300);
            bl.bill();
            bl.setLocationByPlatform(true);
            bl.getContentPane().setBackground(Color.CYAN);
            bl.setLayout(null);
            bl.setVisible(true);
            this.dispose();
            bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
        }
         
}
        }
        
        
    

