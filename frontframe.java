package pharmacyagain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.event.ActionListener;

public class frontframe extends JFrame implements ActionListener
{
    public static int flg = 0;
    public JLabel jl = new JLabel();
    public JLabel jl1 = new JLabel();
    public JButton btn = new JButton();
    public JButton btn2 = new JButton();
    public JButton btn3 = new JButton();
    public JButton btn4 = new JButton();
    public JLabel in = new JLabel();
    Font f = new Font("Times New Roman", Font.BOLD, 18);
    Font f1 = new Font("Times New Roman", Font.PLAIN, 16);
    Font f3 = new Font("Times New Roman", Font.PLAIN, 14);

    public void initialize()
    {
        jl.setText("WELCOME TO BEST CASE PHARMACY");
        jl.setBounds(150, 25, 400, 40);
        jl.setForeground(Color.WHITE);
        jl.setFont(f);
        this.add(jl);

        jl1.setText("LOGIN");
        jl1.setBounds(260, 100, 200, 40);
        jl1.setForeground(Color.WHITE);
        jl1.setFont(f1);
        this.add(jl1);

        btn.setText("ADMIN LOGIN");
        btn.setBounds(205, 220, 185, 30);
        btn.setFont(f3);
        btn.setForeground(Color.BLACK);
        btn.setFont(f);
        btn.addActionListener(this);
        this.add(btn);

        Icon ic = new ImageIcon(this.getClass().getResource("AbF3.gif"));
        in.setBounds(50, 20, 900, 500);
        in.setIcon(ic);
        this.add(in);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String op = ae.getActionCommand();
        if (flg == 0) 
        {
            if (op.compareTo("ADMIN LOGIN") == 0) 
            {
                admin a = new admin();
                a.setTitle("BEST CASE MEDICINE");
                a.setSize(650, 500);
                a.initialize();
                a.setLocationByPlatform(true);
                a.getContentPane().setBackground(Color.getColor("WHITE", 677));
                a.setLayout(null);
                a.setVisible(true);
                this.dispose();
                a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
    }
}