import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.IllegalStateException;



public class Config {
	public static int[][]setLevel(String parameter,int line,int column ,int [][]defaultLevel){
		String temp =fromFile(parameter);
		int count = line*column;
		int[][] tempInt= new int [line][column];
		int space_count=0;
		if(temp == null) {
			
			return defaultLevel;
		}
		//try {
			int[] space = new int [count -1];
			space[0]= temp.indexOf(' '); // zwraca wartosc indeksu na ktorym znajduje sie spacja
			for (int i =0; i< count-2;i++) {
				space[i+1] = temp.indexOf(' ', space[i] +1); // zwraca wartosc indeksu na ktorym jest spacja ale po indeksie spac[i]+1
			}
			try {
				for(int i =0 ;i<line ;i++) {
					for(int j=0;j<column; j++) {
						if(i==0&&j==0)tempInt[i][j]=(Integer.parseInt(temp,0,1,10));
						else if(i==3 && j==6)tempInt[i][j]=(Integer.parseInt(temp,54,55,10));
						else {
						tempInt[i][j]=(Integer.parseInt(temp,space[space_count]+1,space[space_count+1],10));
						space_count++;
						}
					}
					
				}
			}
			catch(NumberFormatException e) {
				
				return defaultLevel;
			}
		//}
		//catch(NullPointerException e) {
		//	System.out.println("here");
		//	return defaultLevel;
		//}
		return tempInt;
	}
	
	/**
	 * Zamiana odczytanej wartosci strin na int
	 * @param parameter
	 * @param defaultValue
	 * @return
	 */
	public static int setValue (String parameter, int defaultValue) {
		String temp = fromFile(parameter);
		int tempValue;
		if(temp==null) return defaultValue;
		try {
			tempValue = Integer.parseInt(temp);
		}
		catch(NumberFormatException e) {
			return defaultValue;
		}
		return tempValue;
		
	}
	/**
	 * odczyt lini kodu odpowiednich parametrow z pliku config.txt
	 * @param description
	 * @return
	 */
	
	public static String fromFile(String description) {
		File file = new File ("C:\\Studia\\Semestr 4\\PROZE\\Projekt\\SpaceInvaders\\Source Code\\config.txt");
		Scanner in =null;
		try {
			in = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			return null;
		}
		String parameter = null;
		try {
			while(true) {
				parameter = in.nextLine(); //przechodzi do nastêpnej lini kodu i zwraca zczytan¹
				if(parameter.equals(description)) {
					parameter = in.nextLine(); // zapisuje do parameter linie kodu z danymi
					
					break;
				}
				
			}
		}
		catch(NoSuchElementException e) {
			try {
				in.close();
			}
			catch(IllegalStateException ise) {
				return null;
			}
			
		}
		catch (IllegalStateException e) {
			try {
				in.close();
			}
			catch(IllegalStateException ise) {
				return null;
			}
			
		}
		try {
			in.close();
		}
		catch(IllegalStateException ise) {
		}
		return parameter;

	}
	
}
