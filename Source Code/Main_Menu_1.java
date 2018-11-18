import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



public class Main_Menu_1 extends JFrame implements ActionListener {
	
	JButton button_play, button_instruction;
	
	public Main_Menu_1(){
		setSize(400,600);
		setTitle("Space Invaders Main Menu");
		setLayout(null);
		
		button_play = new JButton("Start Game");
		button_play.setBounds(150, 100, 100, 20);
		add (button_play);
		button_play.addActionListener(this);
		
		button_instruction = new JButton("Instruction");
		button_instruction.setBounds(150, 150, 100, 20);
		add(button_instruction);
		button_instruction.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button_play) {
			System.out.println("Play");
		}
		else if( source == button_instruction) {
			Config instruction=new Config();
			JOptionPane.showMessageDialog(this, instruction.getInstruction());
		}
		else
		System.out.println("elo mordo");
		
	}
	
}
