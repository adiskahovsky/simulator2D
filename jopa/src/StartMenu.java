import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartMenu extends JFrame{
	public final int xSize = 800;
	public final int ySize = 500;
	private JPanel panel;
	private JTextField txt1, txt2, txt3;
	private JButton button;
	private JLabel label;
	
	public StartMenu() {
		setTitle("jopa");
		setSize(xSize, ySize);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		initCompanents();
		action();
	}
	
	private void initCompanents(){
		panel = new JPanel();
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		button = new JButton("START");
		label = new JLabel(new ImageIcon("chem.jpg"));
		add(panel);
		label.setBounds(0, 0, xSize, ySize);
		panel.add(label);
		button.setBounds(xSize/2-50, ySize/2-25, 100, 50);
		label.add(button);
		txt1.setBounds(245, ySize/12, 300, 25);
		txt2.setBounds(245, ySize/6, 300, 25);
		txt3.setBounds(245, ySize/4, 300, 25);
		label.add(txt1);
		label.add(txt2);
		label.add(txt3);
		panel.revalidate();
	}
	
	private void action() {
					
	}
}