package AdvantureGame_00;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class AnaMenu {


	

	public static void main(String[] args) throws Exception{

	/*System.out.println("********OYUN SENARYOSU******");

	do {
	Start startGame= new Start();

		 
 Player player= new Player(startGame.SelectPlayerName(),
							  startGame.c.get(startGame.SelectChracter()-1),
							  startGame.gun.get(startGame.SelectGun()-1),
							  startGame.armor.get(startGame.SelectArmor()-1),
							  startGame.location.get(startGame.SelectLocations()-1));
	 
	 	player.ShowPlayerAbout();
	 	
}while(false);	
	*/
		
		JFrame f= new JFrame("My first Frame");
	
		JButton bt= new JButton("");
		bt.setText("Bas buraya");
		bt.setLayout(new FlowLayout());
		bt.setBounds(50, 50, 100 , 20);
		
		JLabel lb=new JLabel();
		List<JLabel> l= new ArrayList<JLabel>();
		
		Color bg= new Color(255,5,5);
		
		lb.setText("0. Defa Týklandý");
		lb.setBounds(50, 100, 300, 20);

		l.add(new JLabel());
		l.get(0).setBounds(lb.getX(), lb.getY(), lb.getWidth(), lb.getHeight());
		l.get(0).setText(lb.getText());
		
		bt.addActionListener(new ActionListener(){
		
	
			public static int c=1;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				l.add(new JLabel());
				l.get(c).setBounds(lb.getX(), lb.getY(), lb.getWidth(), lb.getHeight());
				l.get(c).setBackground(Color.BLUE);
				l.get(c).setText(lb.getText());
				
				
				lb.setText(c++ +". Defa Týklandý");
				lb.setLocation(lb.getX()+c, lb.getY()+c);
			
			
			for(JLabel lj:l) f.add(lj);
			}
			
			});
		
		
		f.add(lb);
		f.add(bt);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

	
		
		
}