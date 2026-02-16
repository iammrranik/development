package GUI;

import javax.swing.*; // JFrame, JLabel, JTextField, JButton
import java.awt.*; // Font, color
import java.awt.event.*; // Action Listener

import Entity.*;
import EntityList.*;

public class HomePage extends JFrame implements ActionListener{

    Font titleCambria30=new Font("Cambria", Font.BOLD, 30);
    Font titleArial30=new Font("Arial", Font.BOLD, 30);
    Font textCambria30=new Font("Cambria", Font.PLAIN, 30);
    Font textCambria25=new Font("Cambria", Font.PLAIN, 25);
    Font textArial30=new Font("Arial", Font.PLAIN, 30);
    Font textArial25=new Font("Arial", Font.PLAIN, 25);
    Font textArial20=new Font("Arial", Font.PLAIN, 20);

    JLabel titleText;
    JButton loginBtn, exitBtn;

    public HomePage(){

        // Init Frame
        super("Home Page");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setLocation(125, 25);
        this.setLayout(null);
        
        titleText=new JLabel("Welcome to Emergency Blood Bank");
        titleText.setBounds(280, 30, 520, 70);
        titleText.setFont(titleArial30);
        titleText.setForeground(Color.RED);
        this.add(titleText);

        //Button
		loginBtn = new JButton("Login");
		loginBtn.setBounds(750,580,100,40);
		loginBtn.setFont(textArial20);
		loginBtn.setBackground(Color.RED);
		loginBtn.setForeground(Color.WHITE);
		loginBtn.addActionListener(this);
		this.add(loginBtn);

        //Button
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(860,580,100,40);
		exitBtn.setFont(textArial20);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.addActionListener(this);
		this.add(exitBtn);

        //Load Frame Icon
        ImageIcon frameIcon = new ImageIcon("./GUI/Resources/icon.jpg");
        this.setIconImage(frameIcon.getImage());

        // Load Background Image
		ImageIcon homeBg = new ImageIcon("./GUI/Resources/homeBg.jpg");
		JLabel homeBackground = new JLabel(homeBg);
		homeBackground.setBounds(0,0,1080,720);
		this.add(homeBackground);
        
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent h){
        if(h.getSource() == loginBtn){
            LoginPage loginPage=new LoginPage(this);
            // loginPage.setVisible(true);
            // this.dispose();
            this.setVisible(false);
        }else if(h.getSource() == exitBtn){
            // System.exit(0);
            this.dispose();
        }
    }
}
