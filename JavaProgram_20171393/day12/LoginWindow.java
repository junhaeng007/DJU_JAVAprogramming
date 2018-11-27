package day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class User {
	private String id;
	private String pwd;
	
	public User(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
}

public class LoginWindow extends JFrame {

	JTextField id;
	JPasswordField pwd;
	Vector<User> v = new Vector<>();

	public LoginWindow()
	{
		setTitle("login window");
		setSize(300, 150);

		JPanel panel = new JPanel();
		add(panel);

		panel.add(new JLabel("id    "));
		panel.add(id = new JTextField(20));
		panel.add(new JLabel("pass"));
		panel.add(pwd = new JPasswordField(20));

		JButton login = new JButton("login");
		panel.add(login);

//=========================로그인 버튼 클릭==========================================
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("admin") && pwd.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null, "로그인 성공!");
				}
				else {
					JOptionPane.showMessageDialog(null, "로그인 실패!");
				}
			}
		});

//========================취소 버튼 클릭==========================================
		JButton cancel = new JButton("cancel");
		panel.add(cancel);
		
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pwd.setText("");
			}
		});
		
//========================가입 버튼 클릭==========================================
		JButton signup = new JButton("sign up");
		panel.add(signup);
		
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String _id = id.getText().toString();
				String _pwd = pwd.getText().toString();
				int n = 0;
				
				User user = new User(_id, _pwd);
				v.add(user);
				for(User u : v) {
					System.out.println("[" + ++n + "] " + u.getId() + " / " + u.getPwd());
				}
				System.out.println("-----------------------");
				System.out.println(""); System.out.println("");
				
				
//				if(id.getText().equals("admin") && pwd.getText().equals("1234")) {
//					JOptionPane.showMessageDialog(null, "로그인 성공!");
//				}
//				else {
//					JOptionPane.showMessageDialog(null, "로그인 실패!");
//				}
			}
		});

//=============================================================================	
		add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginWindow();
	}
}
