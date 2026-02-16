package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.*;
import EntityList.*;

public class Login extends JFrame implements ActionListener{

    JLabel userNameLable, userPassLabel;
    JTextField userName;
    JPasswordField password;
    JButton btnLogin;

    Font font = new Font("cambria", Font.PLAIN, 20);

    public Login() {
        super("Login");
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


		//USER NAME Lable
        userNameLable = new JLabel("User Name");
        userNameLable.setBounds(30, 50, 100, 25);
        userNameLable.setFont(font);
        this.add(userNameLable);
		//USER NAME TextField
        userName = new JTextField();
        userName.setBounds(150, 50, 150, 25);
        userName.setFont(font);
        this.add(userName);
		
		//User Password Label 
        userPassLabel = new JLabel("Password");
        userPassLabel.setBounds(30, 100, 100, 25);
        userPassLabel.setFont(font);
        this.add(userPassLabel);
		//User Password Password Field
        password = new JPasswordField();
        password.setBounds(150, 100, 150, 25);
		password.setEchoChar('*');
        password.setFont(font);
        this.add(password);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(165, 140, 120, 35);
        btnLogin.setFont(font);
        btnLogin.addActionListener(this);
        this.add(btnLogin);

        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (btnLogin == e.getSource()) {
            String name = userName.getText();
            String pass = String.valueOf(password.getPassword());

            if (name.equals("mahmud") && pass.equals("1234")) {
				
				JOptionPane.showMessageDialog(this, "Login Successfull");
				
				StudentList students = new StudentList(100);
				StudentPage sp = new StudentPage(this,students);
				
                userName.setText("");
                password.setText("");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid User Name or Password", 
                                                      "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
