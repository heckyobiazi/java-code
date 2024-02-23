import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;
import java.awt.Dimension;

public class guiexample extends JFrame implements ActionListener {
	JButton buttonYellow = new JButton("Yellow");
	JButton buttonBlue= new JButton("Blue");
	JButton  buttonRed = new JButton("Red");
	
	public guiexample() {
		
		setTitle("ButtonTest");
		setSize(500,250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		buttonYellow.setBackground(Color.yellow);
		buttonYellow.setPreferredSize(new Dimension(100,50));
		buttonYellow.setFont(new Font("yellowButtonFont", Font.BOLD, 20));
		buttonYellow.addActionListener((ActionListener) this);
		
		buttonBlue.setBackground(Color.blue);
		buttonBlue.setPreferredSize(new Dimension(100,50));
		buttonBlue.setFont(new Font("yellowButtonFont", Font.BOLD, 20));
		buttonBlue.addActionListener((ActionListener) this);
		
		 buttonRed.setBackground(Color.red);
		buttonRed.setPreferredSize(new Dimension(100,50));
		 buttonRed.setFont(new Font("yellowButtonFont", Font.BOLD, 20));
		 buttonRed.addActionListener(this);
		
		this.add(buttonYellow);
		this.add(buttonBlue);
		this.add(buttonRed);//this.setVisible(true);
		
		}
	
	public static void main(String[] args)
	{
		guiexample clickFrame = new guiexample();
		
		clickFrame.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == buttonYellow)
		{
			getContentPane().setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null, "You clicked on Yellow!");	
		}
		if(e.getSource() == buttonRed)
		{
			getContentPane().setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "You clicked on Red!");	
		}
		if(e.getSource() == buttonBlue)
		{
			getContentPane().setBackground(Color.BLUE);
			JOptionPane.showMessageDialog(null, "You clicked on Blue!");	
		}
	}
}
