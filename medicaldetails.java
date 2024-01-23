package pharmacyagain;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class medicaldetails extends JFrame implements ActionListener
{
    public JLabel jl = new JLabel();
    public JLabel jls = new JLabel();
    public JLabel jl1 = new JLabel();
    public JLabel jl2 = new JLabel();
    public JLabel jl3= new JLabel();
    public JLabel jl4 = new JLabel();
    public JLabel jl5 = new JLabel();
    public JLabel N = new JLabel();
    public JLabel Q = new JLabel();
    public JLabel P = new JLabel();
    public JLabel D = new JLabel();
    public JLabel DE = new JLabel();
    public JButton b = new JButton();
    public JLabel[] s = new JLabel[19];
    public JLabel[] q = new JLabel[19];
    public JLabel[] p = new JLabel[19];
    public JLabel[] dm = new JLabel[19];
    public JLabel[] de = new JLabel[19];
    public String[] Name = new String[19];
    public String[] Quantity = new String[19];
    public String[] Price = new String[19];
    public String[] DateOFM = new String[19];
    public String[] DateOFE = new String[19];
    public JButton back = new JButton();
    public DefaultTableModel tmod = new DefaultTableModel();
    Font f = new Font("Times New Roman", Font.BOLD, 18);
    Font f1 = new Font("Times New Roman", Font.PLAIN, 16);

    public void medicaldetail()
    {  
        try {                                                                               
            File f = new File("C:\\Users\\Fattani Computers\\Desktop\\medicines.txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext()) {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                Name[i] = arr[0];
                Quantity[i] = arr[1];
                Price[i] = arr[2];
                DateOFM[i] = arr[3];
                DateOFE[i] = arr[4];
                i++;
            }
            input.close();
        } 
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < Name.length; i++)
        {
            s[i] = new JLabel(Name[i]);
            s[i].setBounds(10, 70 + (i * 10), 150, 10);
            s[i].setBackground(Color.black);
            s[i].setForeground(Color.white);
            this.add(s[i]);

            q[i] = new JLabel(Quantity[i]);
            q[i].setBounds(170, 70 + (i * 10), 80, 10);
            q[i].setBackground(Color.black);
            q[i].setForeground(Color.white);
            this.add(q[i]);

            p[i] = new JLabel(Price[i]);
            p[i].setBounds(260,  70 + (i * 10), 80, 10);
            p[i].setBackground(Color.black);
            p[i].setForeground(Color.white);
            this.add(p[i]);

            dm[i] = new JLabel(DateOFM[i]);
            dm[i].setBounds(370,  70 + (i * 10), 150, 10);
            dm[i].setBackground(Color.black);
            dm[i].setForeground(Color.white);
            this.add(dm[i]);

            de[i] = new JLabel(DateOFE[i]);
            de[i].setBounds(550,  70 + (i * 10), 150, 10);
            de[i].setBackground(Color.black);
            de[i].setForeground(Color.white);
            this.add(de[i]);
}
        
        jl.setText("LIST OF MEDICINE");
        jl.setBounds(5, 10, 400, 40);
        jl.setForeground(Color.WHITE);
        jl.setFont(f);
        this.add(jl);
        
        back.setText("BACK");
        back.setBounds(450, 400, 80, 40);
        back.setFont(f1);
        back.addActionListener(this);
        this.add(back);

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String op = ae.getActionCommand();
       
        if (op.compareTo("BACK") == 0) 
        {
            select st = new select();
            st.setTitle("BEST CASE MEDICINE");
            st.setSize(650, 500);
            st.initialize();
            st.setLocationByPlatform(true);
            st.getContentPane().setBackground(Color.getColor("BLUE", 38));
            st.setLayout(null);
            st.setVisible(true);
            this.dispose();
            st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
    }
}