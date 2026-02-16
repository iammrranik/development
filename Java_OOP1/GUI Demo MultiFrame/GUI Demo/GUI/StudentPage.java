package GUI;
import javax.swing.*;//JFrame(window),JLabel, JButton, JTextField, JTextArea, etc..
import java.awt.*; //Font,Color
import java.awt.event.*;

import Entity.*;
import EntityList.*;

public class StudentPage extends JFrame implements ActionListener{

	Font font25 = new Font("Cambria",Font.BOLD,25);
	Font font20 = new Font("Cambria",Font.PLAIN,20);
	Font font15 = new Font("Cambria",Font.PLAIN,15);

	JTextField  name,id,age,cgpa;
	JTextArea textArea;
	JButton addBtn,deleteBtn,logoutBtn;
	JComboBox comboBox;

	StudentList students;
	Login login;

	//init Frame
	public StudentPage(Login login,StudentList students){
		super("Student Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,600);
		this.setLocation(300,50);
		this.setLayout(null);
		
		this.students = students;
		this.login = login;

		//Title
		JLabel title = new JLabel("Welcome to Student Managemnt System");
		title.setBounds(100,10,600,50);//x,y,w,h
		title.setFont(font25);
		this.add(title);
		
		//-----------Name------------
		//Lable
		int vPos = 60;
		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setBounds(10,vPos,100,30);//x,y,w,h
		nameLabel.setFont(font20);
		this.add(nameLabel);
		
		//Field
		name = new JTextField();
		name.setBounds(120,vPos,200,30);
		name.setFont(font20);
		this.add(name);
		
		vPos+=40;
		
		//-----------ID------------
		//Lable
		JLabel idLabel = new JLabel("Student ID");
		idLabel.setBounds(10,vPos,100,30);//x,y,w,h
		idLabel.setFont(font20);
		this.add(idLabel);
		
		//Field
		id = new JTextField();
		id.setBounds(120,vPos,200,30);
		id.setFont(font20);
		this.add(id);
		vPos+=40;
		//-----------Age------------
		//Lable
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(10,vPos,100,30);//x,y,w,h
		ageLabel.setFont(font20);
		this.add(ageLabel);
		
		//Field
		age = new JTextField();
		age.setBounds(120,vPos,200,30);
		age.setFont(font20);
		this.add(age);
		vPos+=40;
		//-----------Cgpa------------
		//Lable
		JLabel cgpaLabel = new JLabel("CGPA");
		cgpaLabel.setBounds(10,vPos,100,30);//x,y,w,h
		cgpaLabel.setFont(font20);
		this.add(cgpaLabel);
		
		//Field
		cgpa = new JTextField();
		cgpa.setBounds(120,vPos,200,30);
		cgpa.setFont(font20);
		this.add(cgpa);
		vPos+=40;
		
		
		//Text Area
		textArea = new JTextArea();
		textArea.setFont(font20);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(350,60,300,400);//x,y,w,h
		this.add(scrollPane);
		
		//Button
		addBtn = new JButton("Add");
		addBtn.setBounds(120,400,200,30);
		addBtn.setFont(font20);
		addBtn.setBackground(Color.BLUE);
		addBtn.setForeground(Color.WHITE);
		addBtn.addActionListener(this);
		this.add(addBtn);

		//Button
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(120,440,200,30);
		deleteBtn.setFont(font20);
		deleteBtn.setBackground(Color.BLACK);
		deleteBtn.setForeground(new Color(255,255,255));
		deleteBtn.addActionListener(this);
		this.add(deleteBtn);

		//Button
		logoutBtn = new JButton("<=Logout");
		logoutBtn.setBounds(120,480,200,30);
		logoutBtn.setFont(font20);
		logoutBtn.setBackground(Color.RED);
		logoutBtn.setForeground(new Color(255,255,255));
		logoutBtn.addActionListener(this);
		this.add(logoutBtn);

		comboBox = new JComboBox(new String[]{"Male","Female"});
		comboBox.setBounds(120,vPos,200,30);
		comboBox.setFont(font20);
		this.add(comboBox);

		//Load BackgroundImage
		ImageIcon bg = new ImageIcon("./Resources/bg.jpg");
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,700,600);
		this.add(background);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == addBtn){
			System.out.println("Add Btn Clicked");
			//textArea.setText( textArea.getText()+"\n"+name.getText());
			Student s = new Student(name.getText(),id.getText(),
							Integer.parseInt(age.getText()),
							Float.parseFloat(cgpa.getText()));
			students.insert(s);
			updateTextArea();
		}
		else if(e.getSource() == deleteBtn){
			if(!id.getText().isEmpty()){
				
				Student s = students.getById(id.getText());
				if(s!=null){
					students.remove(id.getText());
					updateTextArea();
					JOptionPane.showMessageDialog(this,"Student Deleted");
				}
				else{
				JOptionPane.showMessageDialog(this,"No Student Found ");
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Please Enter a ID to Delete" );
			}
		}
		else if(e.getSource() == logoutBtn){
			login.setVisible(true);
			this.dispose();
		}
	}
	
	public void updateTextArea(){
		textArea.setText(students.getAllStudentAsString());
	}
	
}