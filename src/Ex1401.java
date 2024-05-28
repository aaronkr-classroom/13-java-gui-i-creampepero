import java.awt.*;
import javax.swing.*;

public class Ex1401 extends JFrame {
	
	public Ex1401() {
		setTitle("프레임 및 아이콘");
		setSize(600, 300);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		add(panel);
		
		setIconImage(new ImageIcon("다운로드.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); //보이기 < 없으면 못봄
	}
	
	public static void main(String[] args) {
		new Ex1401();
		}
			
	}
