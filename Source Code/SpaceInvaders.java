
import java.awt.*;

import javax.swing.JFrame;
public class SpaceInvaders {
	public static void main(String args[]) {
		Config test =new Config();
		int a= test.setValue("#MOVE_TIME_LEVEL", 1);
		System.out.println(a);
		String instruction= new String();
		
		
		int[][]level = new int[4][7];
		int[][] domyslne = {{0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0} };
		level=test.setLevel("#LEVEL_5", 4,7,domyslne);
		for(int i=0;i<4;i++) {
			for(int j=0; j<7;j++) {
				System.out.print(level[i][j]);
				
			}
			System.out.println();
		}
		Main_Menu_1 menu_1 = new Main_Menu_1();
		menu_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu_1.setVisible(true);
		
		
	}
}
