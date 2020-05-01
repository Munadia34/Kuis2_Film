
package film;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LoginView extends JFrame {
	JLabel lusername = new JLabel("username");
	JLabel lpass = new JLabel("password");
	JLabel test = new JLabel("yyy");
	JTextField txtusername = new JTextField();
	JPasswordField txtpass = new JPasswordField();
	JButton login = new JButton("Login");
    
    public LoginView(){
    	setLayout(null);
        add(lusername);
        add(lpass);
        add(txtusername);
        add(txtpass);
        add(login);
     
        lusername.setBounds(50, 25, 100, 20);
        lpass.setBounds(50, 60, 100, 20);
        txtusername.setBounds(130, 25, 140, 20);
        txtpass.setBounds(130, 60, 140, 20);
        login.setBounds(130, 100, 80, 20);
        
        setSize(350,200);
        setVisible(true);
    }
    
    public String getUsername(){
        return txtusername.getText();
    }
    
    public String getPassword(){
        return txtpass.getText();
    }
}
