import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class carcounter extends JFrame implements ActionListener {
JLabel cars = new JLabel("cars");
JLabel vans = new JLabel("vans");
JTextField cartext = new JTextField();
JTextField vantext = new JTextField();
JButton car = new JButton("Car");
JButton van = new JButton("van");
JButton reset = new JButton("reset");
JPanel carpanel = new JPanel(new FlowLayout());
JPanel vanpanel = new JPanel(new FlowLayout());
JPanel buttonpanel = new JPanel(new FlowLayout());
int answercar = 0 ;
        int answervan = 0 ;

public carcounter()
{
this.setSize(700,300);
this.setLayout(new BorderLayout());
this.setTitle("Cars and vans counter");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);

this.car.setPreferredSize(new Dimension(100,30));
this.van.setPreferredSize(new Dimension(100,30));
this.reset.setPreferredSize(new Dimension(100,30));

car.addActionListener(this);
van.addActionListener(this);
reset.addActionListener(this);


cartext.setText("0");
vantext.setText("0");

carpanel.add(cars);
carpanel.add(cartext);
carpanel.add(vans);
carpanel.add(vantext);
buttonpanel.add(car);
buttonpanel.add(van);
buttonpanel.add(reset);

this.add(carpanel, BorderLayout.NORTH);
this.add(buttonpanel, BorderLayout.SOUTH);




}

public static void main(String[] args)
{
   carcounter form = new carcounter();
   form.setVisible(true);
}


    public void actionPerformed(ActionEvent e)
    {
        
       if(e.getSource() == car)
       {
        
        answercar++; 
        String answ = Integer.toString(answercar);
        cartext.setText(answ);
       }
       else if(e.getSource() == van)
       {
         
        answervan++; 
        String answ = Integer.toString(answervan);
        vantext.setText(answ);
       }
       else if(e.getSource() == reset)
       {
           cartext.setText("0");
           vantext.setText("0");
       }
    }
    
}
