package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.*;
import EntityList.*;

public class LoginPage extends JFrame implements ActionListener{
    JLabel userNameText, userPassText;
    JTextField userName;
    JPasswordField password;
    JButton LoginBtn, BackBtn;
    
    Font font = new Font("Cambria", Font.PLAIN, 20);

    HomePage homePage;

    public LoginPage(HomePage homePage){
        super("Login Page");
        this.setSize(440, 330);
        this.setLocation(440, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Connected Pages
        this.homePage=homePage;
    
        //USER NAME Lable
        userNameText = new JLabel("Username");
        userNameText.setBounds(80, 50, 100, 30);
        userNameText.setFont(font);
        this.add(userNameText);
        //USER NAME TextField
        userName = new JTextField();
        userName.setBounds(200, 50, 150, 30);
        userName.setFont(font);
        this.add(userName);
        
        //User Password Label 
        userPassText = new JLabel("Password");
        userPassText.setBounds(80, 100, 100, 30);
        userPassText.setFont(font);
        this.add(userPassText);
        //User Password Password Field
        password = new JPasswordField();
        password.setBounds(200, 100, 150, 30);
        password.setEchoChar('*');
        password.setFont(font);
        this.add(password);

        //Login
        LoginBtn = new JButton("Login");
        LoginBtn.setBounds(215, 160, 120, 32);
        LoginBtn.setFont(font);
        LoginBtn.addActionListener(this);
        this.add(LoginBtn);

        //Back
        BackBtn = new JButton("Back");
        BackBtn.setBounds(215, 200, 120, 32);
        BackBtn.setFont(font);
        BackBtn.addActionListener(this);
        this.add(BackBtn);

        //Load Frame Icon
        ImageIcon frameIcon = new ImageIcon("./GUI/Resources/login.png");
        this.setIconImage(frameIcon.getImage());

        // Load Login User Icon
		ImageIcon loginUser = new ImageIcon("./GUI/Resources/loginUser.png");
		JLabel loginUserIcon = new JLabel(loginUser);
		loginUserIcon.setBounds(32,50,32,32);
		this.add(loginUserIcon);

        // Load Login Password Icon
		ImageIcon loginPassword = new ImageIcon("./GUI/Resources/loginPassword.png");
		JLabel loginPasswordIcon = new JLabel(loginPassword);
		loginPasswordIcon.setBounds(32,100,32,32);
		this.add(loginPasswordIcon);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(LoginBtn == e.getSource()){
            // String name = userName.getText();
            // String pass = String.valueOf(password.getPassword());

            // if(name.equals("admin") && pass.equals("admin")){
            //     JOptionPane.showMessageDialog(this, "Login Successfull");
            //     List users = new List(100);
            //     LoginPage hp = new LoginPage(this, users);
            //     userName.setText("");
            //     password.setText("");
            //     this.setVisible(false);
            // }else{
                // JOptionPane.showMessageDialog(this, "Invalid User Name or Password", "Error",JOptionPane.ERROR_MESSAGE);
            // }
        }else if(BackBtn == e.getSource()){
            homePage.setVisible(true);
            this.dispose();
        }
    }
}
