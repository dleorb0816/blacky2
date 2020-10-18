package ex05;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names= {"���","��","ü��"};
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		MyItemListener listener = new MyItemListener();
		for(int i = 0; i<fruits.length;i++) {
			fruits[i]= new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			//üũ�ڽ� ������ ��ü����! �����ʸ� �ܴ�!
			fruits[i].addItemListener(listener);
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	
	public class MyItemListener implements ItemListener{
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -=100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�.");
		}
		
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}