package Session2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	
	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0;
	
	public static void main(String[] args) {

		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			while(inFile.hasNext()) { // 파일의 끝에 도달했는지 확인 
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(0); //프로그램 자체 종료 
		}
		
		bubblesort();
		
		for(int i=0; i<n; i++) System.out.println(name[i] + ": "+ number[i]);
	}
		
		static void bubblesort() {
			for(int i=n-1; i>0; i--) {
				for(int j=0; j<i; j++) {
					if(name[j].compareTo(name[j+1]) > 0) { //str1.equals(str2) 
						//swap data[j] and data[j+1]
						String tmp = name[j];
						name[j] = name[j+1];
						name[j+1] = tmp;
						
						tmp = number[j];
						number[j] = number[j+1];
						number[j+1] = tmp;
					}
				}
			}
		}
	}