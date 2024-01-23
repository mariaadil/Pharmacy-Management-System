package pharmacyagain;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class admin extends JFrame implements ActionListener
{
    JButton login = new JButton();
    JLabel Ibn = new JLabel();
    JLabel Ibn1 = new JLabel();
    JLabel Ibn2 = new JLabel();
    JLabel Ibn3 = new JLabel();
    Font f = new Font("Times New Roman", Font.BOLD, 20);
    Font f3 = new Font("Times New Roman", Font.PLAIN, 14);
    JTextField mainTxt = new JTextField();
    JPasswordField mainTxt1 = new JPasswordField();

    public void initialize()
    {
        Ibn.setText("WELCOME TO BEST CASE PHARMACY");
        Ibn.setBounds(150, 25, 400, 40);
        Ibn.setForeground(Color.WHITE);
        Ibn.setFont(f);
        this.add(Ibn);

        Ibn1.setText("Admin's Login");
        Ibn1.setBounds(150, 100, 200, 40);
        Ibn1.setHorizontalAlignment(SwingConstants.CENTER);
        Ibn1.setForeground(Color.WHITE);
        Ibn1.setFont(f);
        this.add(Ibn1);

        Ibn2.setText("Username:");
        Ibn2.setBounds(70, 200, 280, 40);
        Ibn2.setHorizontalAlignment(SwingConstants.LEFT);
        Ibn2.setForeground(Color.WHITE);
        Ibn2.setFont(f);
        this.add(Ibn2);

        mainTxt.setText("");
        mainTxt.setBounds(180, 200, 280, 40);
        mainTxt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        mainTxt.setHorizontalAlignment(SwingConstants.LEFT);
        mainTxt.setFont(f3);
        mainTxt.addActionListener(this);
        this.add(mainTxt);

        Ibn3.setText("Password:");
        Ibn3.setBounds(70, 250, 250, 40);
        Ibn3.setHorizontalAlignment(SwingConstants.LEFT);
        Ibn3.setForeground(Color.WHITE);
        Ibn3.setFont(f);
        this.add(Ibn3);

        mainTxt1.setText("");
        mainTxt1.setBounds(180, 250, 280, 40);
        mainTxt1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        mainTxt1.setHorizontalAlignment(SwingConstants.LEFT);
        mainTxt1.setFont(f3);
        mainTxt1.addActionListener(this);
        this.add(mainTxt1);

        login.setText("LOGIN");
        login.setBounds(250, 320, 80, 40);
        login.addActionListener(this);
        this.add(login);

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String op = ae.getActionCommand();
        if(mainTxt.getText().equals("Maria Adil")&& mainTxt1.getText().equals("maria101"))
        {
        if (op.compareTo("LOGIN") == 0) 
        {
            select s = new select();
            s.setTitle("BEST CASE MEDICINE");
            s.setSize(650, 500);
            s.initialize();
            s.getContentPane().setBackground(Color.getColor("BLUE", 38));
            s.setLayout(null);
            s.setVisible(true);
            this.dispose();
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        }
        else
            if(mainTxt.getText().equals("")&& mainTxt1.getText().equals(""))
            {
                if (op.compareTo("LOGIN")== 0)
                {
                    JOptionPane.showInternalMessageDialog(null, "Enter Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
        
                } 
            }
            else
            if(mainTxt.getText().equals(""))
            {
                if (op.compareTo("LOGIN")== 0)
                {
                    JOptionPane.showInternalMessageDialog(null, "Enter Username", "Error", JOptionPane.ERROR_MESSAGE);
        
                }
            }
        else
            if(mainTxt1.getText().equals(""))
            {
                if (op.compareTo("LOGIN")== 0)
                {
                    JOptionPane.showInternalMessageDialog(null, "Enter Password", "Error", JOptionPane.ERROR_MESSAGE);
        
                }
            }
        else 
        {
           JOptionPane.showInternalMessageDialog(null, "Wrong Username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
