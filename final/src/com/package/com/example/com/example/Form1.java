package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame 
{
    JLabel name = new JLabel("Name: ");
    JLabel realname = new JLabel();
    JLabel surname = new JLabel("SurName: ");
    JLabel realsurname = new JLabel();
    JLabel gender = new JLabel("Gender: ");
    JLabel realgender = new JLabel();
    JLabel country = new JLabel("Country: ");
    JLabel realcountry = new JLabel();
    JLabel hobbies = new JLabel();
    JLabel hobby = new JLabel("Hobbies: ");
    JLabel gym = new JLabel();
    JLabel fashion = new JLabel();
    JPanel namepanel = new JPanel(new GridLayout());
    JPanel surnamepanel = new JPanel(new FlowLayout());
    JPanel genderpanel = new JPanel(new FlowLayout());
    JPanel countrypanel = new JPanel(new FlowLayout());
    JPanel check = new JPanel(new FlowLayout());


    public Form1()
    {
        this.setTitle("FORM 1");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        
        name.setPreferredSize(new Dimension(100,30));
        surname.setPreferredSize(new Dimension(70,30));
        gender.setPreferredSize(new Dimension(70,30));
        country.setPreferredSize(new Dimension(70,30));
        check.setPreferredSize(new Dimension(70,30));

        namepanel.add(name);
        namepanel.add(realname);
        surnamepanel.add(surname);
        surnamepanel.add(realsurname);
        genderpanel.add(gender);
        genderpanel.add(realgender);
        countrypanel.add(country);
        countrypanel.add(realcountry);
        check.add(hobby);
        check.add(hobbies);
       

namepanel.setPreferredSize(new Dimension(200,30));
surnamepanel.setPreferredSize(new Dimension(200,30));
genderpanel.setPreferredSize(new Dimension(200,30));
countrypanel.setPreferredSize(new Dimension(200,30));
check.setPreferredSize(new Dimension(200,30));

        this.add(namepanel);
        this.add(surnamepanel);
        this.add(genderpanel);
        this.add(countrypanel);
        this.add(check);

    }


 

    
}
