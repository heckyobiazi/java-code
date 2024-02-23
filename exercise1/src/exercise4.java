import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class exercise4 extends JFrame implements ActionListener {
    JTextField textname  = new JTextField();
    JPasswordField textpassword = new JPasswordField(20);
    JLabel begin = new JLabel("THIS IS TODAYS EXERCISE", SwingConstants.CENTER);
     JLabel name = new JLabel("Please enter your name");
     JLabel password = new JLabel("Please enter your password");
     JLabel gender = new JLabel("Select your gender");
     JRadioButton male = new JRadioButton("male"); 
     JRadioButton female = new JRadioButton("female");
     JPanel naming = new JPanel(new FlowLayout());
     JPanel passwording = new JPanel(new FlowLayout());
     JPanel genn = new JPanel(new FlowLayout());
     JPanel buttonn = new JPanel(new FlowLayout());
     JButton enter = new JButton("ENTER");
     JButton clear = new JButton("CLEAR");
     ButtonGroup group = new ButtonGroup();


     public exercise4()
     {
        this.setLayout(new GridLayout(0,1));
        this.setSize(700,400);
        this.setTitle("EXERCISE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.textname.setPreferredSize(new Dimension(120,30));
        this.textpassword.setPreferredSize(new Dimension(120,30));

        this.enter.setPreferredSize(new Dimension(100,30));
        this.enter.setFont(new Font("ButtonFont", Font.BOLD, 10));
        this.clear.setPreferredSize(new Dimension(100,30));
        this.clear.setFont(new Font("ButtonFont", Font.BOLD, 10));
       
        
        group.add(male);
        group.add(female);


        enter.addActionListener(this);
        clear.addActionListener(this);

        naming.add(name);
        naming.add(textname);
        passwording.add(password);
        passwording.add(textpassword);
        genn.add(gender);
        genn.add(male);
        genn.add(female);
        buttonn.add(enter);
        buttonn.add(clear);

        this.add(begin);
        this.add(naming);
        this.add(passwording);
        this.add(genn);
        this.add(buttonn);

     }

     public static void main(String[] args)
     {
         exercise4 read = new exercise4();
         read.setVisible(true);
     }

    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == clear)
        {
              
            textname.setText("");
            textpassword.setText("");
            group.clearSelection();
          
        }
        if(e.getSource() == enter)
        {
            String realname;
            char[] realpassword;
            int save;
            realname = textname.getText();
            realpassword = textpassword.getPassword();
            String pw = new String(realpassword);
            JOptionPane.showMessageDialog(null, "Your name is " + realname + " and your password is " + pw);
            save = JOptionPane.showConfirmDialog(null, "Do you want to save this? ");
            if(save == 0)
            {
                JOptionPane.showMessageDialog(null, "Saved successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not saved");
            }
            
        }
            
       
    }
    
}
