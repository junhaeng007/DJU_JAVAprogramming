package day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuTest extends JFrame implements ActionListener{

	JMenuItem open, exit;
	JLabel lbel;
	JPanel panel;
	
	public MenuTest() {
		setTitle("Menu Test");
		setSize(800, 400);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		menu.add(open = new JMenuItem("Open"));
		open.addActionListener(this);
		
		menu.add(new JMenuItem("Save"));
		
		
		menu.add(exit = new JMenuItem("Exit"));
		exit.addActionListener(this);
		
		menuBar.add(menu);

		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Tools"));
		menuBar.add(new JMenu("Help"));

		setJMenuBar(menuBar);
		
		lbel = new JLabel();
		panel = new JPanel();
		panel.add(lbel, "Center");
		add(panel);
		
		setVisible(true);
	}

	public static void main(String args[]) {
		new MenuTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == open) {
			
			JFileChooser jfc = new JFileChooser();	//파일 선택 대화상자 객체
			int r = jfc.showOpenDialog(this);
			
			if(r == JFileChooser.APPROVE_OPTION) {
				String name = jfc.getSelectedFile().getAbsolutePath(); //파일 이름 불러오기
				lbel.setIcon(new ImageIcon(name)); // 선택한 이미지 파일을 보여줌
			}
		}
		else if(obj == exit) {
			System.exit(0);
		}
	}

}
