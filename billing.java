package pharmacyagain;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class billing extends JFrame implements ActionListener 
{
    medicineselection obj=new medicineselection();public static int flg = 0;
    public JLabel[] jl = new JLabel[19];
    public JLabel[] j2 = new JLabel[19];
    public JLabel j3 = new JLabel();
    public JButton b = new JButton();
    public JButton p = new JButton();
    public int a=0;
    public String total;
    Font f = new Font("Times New Roman", Font.BOLD, 18);
    Font f3 = new Font("Times New Roman", Font.PLAIN, 14);
    public String[] ab={"100","200","10","150","100","20","100","100","100","100"};
    public void bill() 
    {
        medicineselection obj=new medicineselection();
        for (int i = 0; i <10 ; i++) 
        {
            if(obj.s[i].isSelected())
            {
                jl[i]=new JLabel(obj.s[i].getText());
                
                j2[i]=new JLabel(ab[i]);
                a+=Integer.parseInt(ab[i]);
                
                jl[i].setBounds(30,i*30,100,20);
                j2[i].setBounds(120,i*30,100,20);
                add(jl[i]);
                add(j2[i]);
            }
            
        }
        total=String.valueOf(a);
        j3.setText("Total:"+total);
        j3.setBounds(20,200,200,50);
        j3.setFont(f);
        add(j3);
       
        ArrayList<String> al = new ArrayList<>();
        al.add("Amoxicillin");
        al.add("Amlodipine");
        al.add("alAtenolol");
        al.add("Benzydamine");
        al.add("Clobazam");
        al.add("Calcium");
        al.add("Calcipotriol");
        al.add("Cefalexin");
        al.add("Cinnarizine");
        al.add("Digoxin");
        al.add("Docusate");
        al.add("Enalapril");
        al.add("Folic acid");
        al.add("Fluticasone skin creams");
        al.add("Fluticasone nasal spray and drops");
        al.add("Glimepiride");
        al.add("Hydroxocobalamin");
        al.add("Isotretinoin capsules (Roaccutane)");
        al.add("Paracetamol for adults");
        
        p.setText("OK");
        p.setBounds(280, 400, 100, 40);
        p.setForeground(Color.BLACK);
        p.setFont(f3);
        p.addActionListener(this);
        this.add(p);   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String op = e.getActionCommand();
         if (op.compareTo("OK") == 0)
            {
                select s = new select();
                s.setTitle("BEST CASE MEDICINE");
                s.setSize(650, 500);
                s.initialize();
                s.setLocationByPlatform(true);
                s.getContentPane().setBackground(Color.getColor("BLUE", 38));
                s.setLayout(null);
                s.setVisible(true);
                this.dispose();
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
         
        
         
     
         
         
        
    }

}