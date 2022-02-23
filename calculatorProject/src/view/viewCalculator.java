package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controller.controllerCalculator;
import model.model_Calculator;

public class viewCalculator extends JFrame {
	private JButton jb_0=new JButton("0"); 
	private JButton jb_1=new JButton("1");
	private JButton jb_2=new JButton("2");
	private JButton jb_3=new JButton("3");
	private JButton jb_4=new JButton("+");
	private JButton jb_5=new JButton("-");
	private JButton jb_6=new JButton("4");
	private JButton jb_7=new JButton("5");
	private JButton jb_8=new JButton("6");
	private JButton jb_9=new JButton("x");
	private JButton jb_10=new JButton(":");
	private JButton jb_11=new JButton("7");
	private JButton jb_12=new JButton("8");
	private JButton jb_13=new JButton("9");
	private JButton jb_14=new JButton(".");
	private JButton jb_15=new JButton("=");
	private JTextField jt=new JTextField();
	private JPanel jp_1=new JPanel();
	private JPanel jp_2=new JPanel();
	protected model_Calculator mc=new model_Calculator();
	public viewCalculator() {
		ActionListener event=new controllerCalculator(this);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jp_1.setLayout(new GridLayout(3,5,10,10));
		this.jb_1.addActionListener(event);
		this.jb_2.addActionListener(event);
		this.jb_3.addActionListener(event);
		this.jb_4.addActionListener(event);
		this.jb_5.addActionListener(event);
		this.jb_6.addActionListener(event);
		this.jb_7.addActionListener(event);
		this.jb_8.addActionListener(event);
		this.jb_9.addActionListener(event);
		this.jb_10.addActionListener(event);
		this.jb_11.addActionListener(event);
		this.jb_12.addActionListener(event);
		this.jb_13.addActionListener(event);
		this.jb_14.addActionListener(event);
		this.jb_15.addActionListener(event);
		this.jp_1.add(jb_1);
		this.jp_1.add(jb_2);
		this.jp_1.add(jb_3);
		this.jp_1.add(jb_4);
		this.jp_1.add(jb_5);
		this.jp_1.add(jb_6);
		this.jp_1.add(jb_7);
		this.jp_1.add(jb_8);
		this.jp_1.add(jb_9);
		this.jp_1.add(jb_10);
		this.jp_1.add(jb_11);
		this.jp_1.add(jb_12);
		this.jp_1.add(jb_13);
		this.jp_1.add(jb_14);
		this.jp_1.add(jb_15);
		this.jp_2.setLayout(new GridLayout());
		this.jp_2.add(jt);
		this.setLayout(new BorderLayout());
		this.add(jp_2, BorderLayout.NORTH);
		this.add(jp_1, BorderLayout.CENTER);
		this.setVisible(true);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void input(String s) {
		this.jt.setText(this.jt.getText()+s);
	}
	public void input(int n){
		this.jt.setText(""+this.mc.getKetqua());
	}
	public void input(long n){
		this.jt.setText(""+n);
	}
	public static boolean isIntNumberic(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch(Exception ex) {

		}
		return false;
	}
}
	
	
