

public class SpaceInvaders {
	public static void main(String args[]) {
		Config test =new Config();
		int a= test.setValue("mordo", 1);
		System.out.println(a);
		
		System.out.println(test.fromFile("#LEVEL_1"));
		int[][]level = new int[4][7];
		int[][] domyslne = {{0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0} };
		level=test.setLevel("#LEVEL_5", 4,7,domyslne);
		for(int i=0;i<4;i++) {
			for(int j=0; j<7;j++) {
				System.out.print(level[i][j]);
				
			}
			System.out.println();
		}
	}
}
