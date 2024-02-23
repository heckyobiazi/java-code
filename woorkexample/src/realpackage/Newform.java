package realpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Newform extends JFrame implements ActionListener
{
    JTextField txtbox = new JTextField(30);
    JLabel name = new JLabel("Enter your name");
    JLabel select = new JLabel("Select the number of courses you want");
    JLabel totalfee = new JLabel ("Total fees is : ");
    JRadioButton home = new JRadioButton("Home Student");
    JRadioButton international = new JRadioButton("Overseas Student");
    JComboBox<Integer> courses = new JComboBox<Integer>();
    JTextField output = new JTextField(15);
    JButton submit = new JButton("Submit");
    JButton clear = new JButton("Clear");
    ButtonGroup btn = new ButtonGroup();


public Newform() throws HeadlessException
{
    setTitle("Fill all of the information below please");
    setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setMinimumSize(new Dimension(450,400));
    setResizable(false);

     for(int i =1; i<=8; i++)
     {
        courses.addItem(i);
     }

      btn.add(home);
      btn.add(international);

      this.add(name);
      this.add(txtbox);
      this.add(home);
      this.add(international);
      this.add(select);
      this.add(courses);
      this.add(submit);
      this.add(totalfee);
      this.add(output);
      this.add(clear);


      submit.addActionListener(this);
      clear.addActionListener(this);

}


@Override
public void actionPerformed(ActionEvent e) 
{
    if(e.getSource() == submit)
    {
      String realname = this.txtbox.getText();
      String numberofcourses = this.courses.getSelectedItem().toString();
      boolean ishome = false;
      int numberofcourse = 0;

      if(home.isSelected())
      {
        ishome = true;
      }
      else if(international.isSelected())
      {
        ishome = false;
      }

      try
      {
        numberofcourse = Integer.parseInt(numberofcourses);
      }
      catch(Exception ex)
      {
          JOptionPane.showMessageDialog(null,"Some error has occurered, please restart");
          System.out.println(ex.getMessage());
      }


      Feecalc fee = new Feecalc(realname,numberofcourse,ishome);
      output.setText("" + fee.CalculateTotalFee() + "TL");
      output.setForeground(Color.BLACK);
      output.setEnabled(true);
    }

else if(e.getSource() == clear)
{
    this.txtbox.setText("");
    this.btn.clearSelection();
    this.output.setText("");
    this.courses.setSelectedItem(0);
    this.txtbox.setEnabled(false);
}
}
}




