package com.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
 JTextField name = new JTextField(25); 
 JTextField surname = new JTextField(25);
 JLabel namelabel = new JLabel("Your name :"); 
 JLabel surnamelabel = new JLabel("Your surname :");
 JButton openform = new JButton("Open form 2");
 JButton closeform = new JButton("Close the form");


public Form1()
{
    this.setSize(400,450);
    this.setTitle("form 1");
    this.setLayout(new FlowLayout());
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    this.add(namelabel);
    this.add(name);
    this.add(surnamelabel);
    this.add(surname);
    this.add(openform);
    this.add(closeform);

    openform.addActionListener(this);
    closeform.addActionListener(this);

}

public static void main (String[] args)
{
    Form1 f1 = new Form1();
    f1.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource() == openform)
{
    String newname, newsurname;
    Form2 f2 = new Form2();
    newname = name.getText();
    newsurname = surname.getText();
    f2.realname.setText(newname);
    f2.realsurname.setText(newsurname);
    f2.setVisible(true);
    dispose();
}
else{
    dispose();
}
}
}
