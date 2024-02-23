import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;






public class exercise1 extends JFrame implements ActionListener {
  JPanel top = new JPanel(new FlowLayout());
  JPanel middle = new JPanel(new FlowLayout());
   JPanel bottom = new JPanel(new FlowLayout());
  JLabel topname = new JLabel("THIS IS THE TOP", SwingConstants.CENTER);
  JLabel middlename = new JLabel("THIS IS THE FRAME", SwingConstants.CENTER);
  JLabel bottomname = new JLabel("THIS IS THE BOTTOM PANEL", SwingConstants.CENTER);

  public exercise1()
  {
    this.setLayout(new FlowLayout());
    this.setSize(400,300);
    this.setTitle("EXERCISE");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
   topname.setPreferredSize(new Dimension(100,100));
   middlename.setPreferredSize(new Dimension(100,100));
   bottomname.setPreferredSize(new Dimension(100,100));

   topname.setHorizontalAlignment(JLabel.CENTER);
   topname.setVerticalAlignment(JLabel.CENTER);

    top.add(topname);
    middle.add(middlename);
    bottom.add(bottomname);

    top.setPreferredSize(new Dimension(200,70));
    middle.setPreferredSize(new Dimension(200,90));
    bottom.setPreferredSize(new Dimension(200,70));

    top.setBackground(Color.RED);
    bottom.setBackground(Color.GREEN);


this.add(top);
this.add(middle);
this.add(bottom);


  }

    public static void main(String[] args) 
    {
        exercise1 form = new exercise1();
        form.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{

}

}
