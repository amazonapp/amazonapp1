//importing all essential packages ( step 1 )
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
// creating another seperate class LoginFrame ( step 3 )
class LoginFrame extends JFrame implements ActionListener
{
        /* Creating objects of Container two JLabels,one JTextField,
              one JPasswordField and one JButton ( step 5 ) */
	Container c;
	JLabel userlabel=new JLabel("username");
	JLabel pwdlabel=new JLabel("password");
	JTextField u_tf=new JTextField();
	JPasswordField p_pf=new JPasswordField();
	JButton btn=new JButton("LOGIN");
	
	// Creating constructor of LoginFrame class ( step 6 )
	LoginFrame()
	{
         // Calling getContentPane() method ( step 7 )
	c=this.getContentPane();
         // Setting Layout manager ( step 8 )
	c.setLayout(null);
           // Setting Background color ( step 9 )
	c.setBackground(Color.YELLOW);
           //Setting Location and Size of above created components ( step 10 )
	userlabel.setBounds(100,100,100,50);
	pwdlabel.setBounds(100,200,100,50);
	u_tf.setBounds(200,100,200,50);
	p_pf.setBounds(200,200,200,50);
	btn.setBounds(250,300,100,50);
         // adding each component to the container ( step 11 ) 
	c.add(u_tf);
	c.add(p_pf);
	c.add(pwdlabel);
	c.add(userlabel);
	c.add(btn);
         // adding ActionListener to the button ( step 15 )
	btn.addActionListener(this);
		
	}
         // overriding actionPerformed() method ( step 12 )
	public void actionPerformed(ActionEvent e)
	{
                  // desired codes inside our actioPerformed() method ( step 14 )
		if(e.getSource()==btn)
		{
			String username=u_tf.getText();
			String pwd=p_pf.getText();
			if(username.equals("mehtab") && pwd.equals("12345") )
			{
				success.setText("Login Successful");
				success.setBounds(250,350,100,50);
				c.add(success);
				
			}
		else 
		{
			warning.setText("wrong username or password");
			warning.setBounds(200,350,300,50);
			c.add(warning);
			
		}
				
		
		}
		
		
		
	}
	
         // Creating two JLabels ( step 13 ) 
	JLabel success=new JLabel();
	
	JLabel warning=new JLabel();
	
}
// creating a class LoginFormDemo ( step 2 )
class LoginFormDemo 
{
	public static void main(String[] args)
	{
                // Creating object of LoginFrame class and setting it's properties ( step 4 ) 
		LoginFrame f=new LoginFrame();
		f.setTitle("Login Form");
		f.setVisible(true);
		f.setBounds(100,100,700,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
