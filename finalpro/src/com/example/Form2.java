package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form2 extends JFrame implements ActionListener
{
 JLabel fname = new JLabel("your name : ");
 JLabel realname = new JLabel("name");
 JLabel fsurname = new JLabel("Your surname");
 JLabel realsurname = new JLabel("surname");
 JButton open = new JButton("open the form1");
 JButton close = new JButton("close the form"); 



public Form2()
{
    this.setTitle("Form2");
    this.setSize(400,450);
    this.setLocationRelativeTo(null);
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    this.add(fname);
    this.add(realname);
    this.add(fsurname);
    this.add(realsurname);
    this.add(open);
    this.add(close);

    addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        if (JOptionPane.showConfirmDialog(null,
        "Are you sure to close this window?", "Really Closing?",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            Form1 f1 = new Form1();
            f1.setVisible(true);
             dispose();
        }
       
        }
        });

    open.addActionListener(this);
    close.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e)
{
    if(e.getSource() == open)
    {
        Form1 f1 = new Form1();
        f1.setVisible(true);
    }
    else{
        dispose();
    }
}
}