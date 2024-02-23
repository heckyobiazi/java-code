package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
    JTextField txtname = new JTextField(25);
    JLabel name = new JLabel("Name :");
    JTextField txtsurname = new JTextField(25);
    JLabel surname = new JLabel("SurName :");
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JLabel country = new JLabel("Country");
    JComboBox<String> cities = new JComboBox<String>();
    JLabel hobbies = new JLabel ("Hobbies");
    JCheckBox gym = new JCheckBox("GYM");
    JCheckBox fashion = new JCheckBox("Fashion");
    JCheckBox console = new JCheckBox("PC/Console Game");
    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");
    JPanel namepanel = new JPanel(new FlowLayout());
    JPanel surnamepanel = new JPanel(new FlowLayout());
    JPanel genderpanel = new JPanel(new FlowLayout());
    JPanel countrypanel = new JPanel(new FlowLayout());
    JPanel check = new JPanel(new FlowLayout());
    JPanel buttonpanel = new JPanel(new FlowLayout());

    public Form2()
    {
        this.setTitle("FORM 1");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        cities.addItem("Nigeria");
        cities.addItem("Ghana");
        cities.addItem("Dubai");
        cities.addItem("Cyprus");
        cities.addItem("Congo");
     
        ButtonGroup grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);

        namepanel.add(name);
        namepanel.add(txtname);
        surnamepanel.add(surname);
        surnamepanel.add(txtsurname);
        genderpanel.add(male);
        genderpanel.add(female);
        countrypanel.add(country);
        countrypanel.add(cities);
        check.add(hobbies);
        check.add(gym);
        check.add(console);
        check.add(fashion);
        buttonpanel.add(submit);
        buttonpanel.add(reset);

        this.add(namepanel);
        this.add(surnamepanel);
        this.add(genderpanel);
        this.add(countrypanel);
        this.add(check);
        this.add(buttonpanel);

        submit.addActionListener(this);
        reset.addActionListener(this);

    }

    public static void main(String[] args)
    {
        Form2 f2 = new Form2();
        f2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submit)
        {
            String nam = txtname.getText();
            String surnam = txtsurname.getText();
            String gend;
            if(male.isSelected())
            {
                gend = "male"; 
            }
            else if(female.isSelected())
            {
                gend = "female";
            }
            String count;
            count = (String) cities.getSelectedItem();
            String hobby = "";
            if(gym.isSelected())
            {
                hobby += "gym ,"; 
            }
            if(fashion.isSelected())
            {
                hobby += "fashion ,";
            }
            if(console.isSelected())
            {
                hobby += "console ,";
            }


            Form1 f1 = new Form1();
            f1.setVisible(true);
            f1.realname.setText(nam);
            f1.realsurname.setText(surnam);
            f1.realgender.setText("male");
            f1.realcountry.setText(count);
            f1.hobbies.setText(hobby);
            System.out.println("hello world");
        }
    }

}
