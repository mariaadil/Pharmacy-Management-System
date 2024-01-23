package pharmacyagain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class select extends JFrame implements ActionListener
{
    public static int flg = 0;
    public JLabel jl = new JLabel();
    public JLabel jl1 = new JLabel();
    public JButton btn = new JButton();
    public JButton btn2 = new JButton();
    public JButton btn3 = new JButton();
    public JButton btn4 = new JButton();
    public JLabel in = new JLabel();
    public JRadioButton rdbtn = new JRadioButton("", true);
    public ButtonGroup bgrp = new ButtonGroup();
    Font f = new Font("Times New Roman", Font.BOLD, 18);
    Font f3 = new Font("Times New Roman", Font.PLAIN, 14);
    public JButton back = new JButton();
    
    public void initialize()
    {
        jl.setText("WELCOME TO BEST CASE PHARMACY");
        jl.setBounds(150, 25, 400, 40);
        jl.setForeground(Color.WHITE);
        jl.setFont(f);
        this.add(jl);

        btn.setText("DETAILS");
        btn.setBounds(205, 220, 185, 30);
        btn.setFont(f3);
        btn.addActionListener(this);
        this.add(btn);

        btn2.setText("SELECT");
        btn2.setBounds(205, 260, 185, 30);
        btn2.setFont(f3);
        btn2.addActionListener(this);
        this.add(btn2);
        
        back.setText("LOGOUT");
        back.setBounds(450, 400, 130, 30);
        back.setFont(f);
        back.addActionListener(this);
        this.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();
            if (op.compareTo("DETAILS") == 0) {
                medicaldetails md = new medicaldetails();
                md.setTitle("BEST CASE MEDICINE");
                md.setSize(650, 500);
                md.medicaldetail();
                md.setLocationByPlatform(true);
                md.getContentPane().setBackground(Color.getColor("WHITE",10));
                md.setLayout(null);
                md.setVisible(true);
                this.dispose();
                md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } 
            else 
                if (op.compareTo("SELECT") == 0) {
                medicineselection md1 = new medicineselection();
                md1.setTitle("BEST CASE MEDICINE");
                md1.setSize(700 , 650);
                md1.medicineselection();
                md1.setLocation(300,30);
                md1.getContentPane().setBackground(Color.getColor("WHITE", 99));
                md1.setLayout(null);
                md1.setVisible(true);
                this.dispose();
                md1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
               else
               if (op.compareTo("LOGOUT") == 0) 
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